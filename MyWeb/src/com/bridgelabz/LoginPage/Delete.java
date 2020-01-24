package com.bridgelabz.user;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.LoginPage.DAOImplimentation;

public class Delete extends HttpServlet{

	public void doPost(HttpServletRequest request,HttpServletResponse response) {
		DAOImplimentation daoObject=new DAOImplimentation();
		String email=request.getParameter("email");
		System.out.println(email);
		String qry="DELETE FROM customer WHERE email='"+email+"';";
		int status=daoObject.update(qry);
		if(status!=0) {
//			request.getRequestDispatcher("LoginPage.jsp");
			try {
				response.sendRedirect("LoginPage.jsp");
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		else {
			request.getRequestDispatcher("Delete.jsp");
		}
	}
}
