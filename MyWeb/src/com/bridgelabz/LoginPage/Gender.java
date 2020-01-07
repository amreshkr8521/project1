package com.bridgelabz.user;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.LoginPage.DAOImplimentation;

public class Gender extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) {
		DAOImplimentation daoImplimentationObject=new DAOImplimentation();
		String gender=(String) request.getAttribute("Gender");
	String[] data=daoImplimentationObject.gender(gender);
		request.setAttribute("data",data);
		request.getRequestDispatcher("Welcome.jsp");
	}

}
