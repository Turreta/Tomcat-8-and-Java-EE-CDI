package com.turreta.cdi.servlet.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.turreta.cdi.servlet.beans.AppDetailBean;

@WebServlet(urlPatterns = "/miservlet")
public class MyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private AppDetailBean appDetailBean;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/* I know it's old-school! Apologies :) */
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>App Detail</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>App Name:" + appDetailBean.getAppName() + "</h1>");
		out.println("<h2>Version:" + appDetailBean.getVersion() + "</h2>");
		out.println("</body>");
		out.println("</html>");
	}

}
