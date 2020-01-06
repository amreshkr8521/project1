package com.bridgelabz.user;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Welcome extends HttpServlet {
public void doPost(HttpServletRequest request,HttpServletResponse response) {
	HttpSession httpSession=request.getSession();
	httpSession.getAttribute("user");
//	httpSession.removeAttribute("user");	
	httpSession.invalidate();
	
	
	//request.getRequestDispatcher("LoginPage.jsp");
	try {
		response.sendRedirect("LoginPage.jsp");
		//request.getRequestDispatcher("LoginPage.jsp").include(request, response);
	} catch (Exception e) {		
		e.printStackTrace();
	}
}
}
