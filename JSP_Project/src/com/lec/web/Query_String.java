package com.lec.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/QueryString")
public class Query_String extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");

		PrintWriter out = resp.getWriter();

		int cnt = Integer.parseInt(req.getParameter("cnt"));

		for (int i = 0; i < cnt; i++) {
			out.println((i + 1) + ": 안녕 Servlet<br/>");
		}
//		http://localhost:8080/QueryString?cnt=10
	}
}
