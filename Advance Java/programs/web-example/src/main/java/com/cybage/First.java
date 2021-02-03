package com.cybage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.print("<h1>1ST GET METHOD</h1>");
		
		//After getting on this servlet go to Second
		
//		RequestDispatcher rd=  request.getRequestDispatcher("Second");
//		rd.forward(request, response);
		
		
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		
		String name = request.getParameter("name");
		pw.print("Welcome "+name);
		ServletConfig config = getServletConfig();
		pw.print("Welcome "+config.getInitParameter("address"));
		//RequestDispatcher rd=  request.getRequestDispatcher("Second");
     	//rd.forward(request, response);
		pw.close();
	}

}
