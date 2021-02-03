package com.cybage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/user/Second")
public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Cookie c[] = request.getCookies();
//		
//		for(Cookie k : c)
//		{
//			if(k.getName().equals("username"))
//			{
//		PrintWriter pw = response.getWriter();
//		pw.print("Second Program");
//		
//		//Store Data in Cookies
//		
//		Cookie kukki = new Cookie("un", "Kaustubh");
//		response.addCookie(kukki);
//
//		pw.close();
//		}
//		else
//		{
//			PrintWriter pw = response.getWriter();
//			pw.print("Not Authorised");
//			Cookie kukki = new Cookie("username", "Kaustubh");
//			response.addCookie(kukki);
//		}
//		}
		
		HttpSession ses = request.getSession();
		
		PrintWriter pw = response.getWriter();
    	pw.print("<br>Welcome "+ses.getAttribute("password"));
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
