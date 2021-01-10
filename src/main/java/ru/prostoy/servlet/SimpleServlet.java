/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.prostoy.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;

/**
 * Класс SimpleServlet
 */
//@WebServlet("/simpleservlet")
public class SimpleServlet  extends HttpServlet {

	private String message;

	@Override
	public void init() throws ServletException {
		message = "This is simple servlet message";
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter messageWriter = response.getWriter();
		messageWriter.println("<h1>" + message + "<h1>");
	}

	@Override
	public void destroy() {

	}
}