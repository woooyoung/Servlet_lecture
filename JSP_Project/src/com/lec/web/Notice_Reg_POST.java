package com.lec.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/notice_reg")
public class Notice_Reg_POST extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");

//		req.setCharacterEncoding("UTF-8");
		
//		characterEncodingFilter 에서 사용

		PrintWriter out = resp.getWriter();

		String title = req.getParameter("title");
		String contents = req.getParameter("contents");

		out.println(title + "<br/>");
		out.println(contents);

	}
}
