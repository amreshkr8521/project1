package com.bridgelabz.user;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.LoginPage.DAOImplimentation;

public class RegistrationHistory extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		HttpSession httpSession=request.getSession();
		request.getParameter("history");
		DAOImplimentation daoImplimentationObject=new DAOImplimentation();
		String email=daoImplimentationObject.LastEmail();
		request.setAttribute("email",email);
		request.getRequestDispatcher("Welcome.java");
		
	}
}
