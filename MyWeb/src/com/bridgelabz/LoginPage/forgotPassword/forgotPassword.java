package com.bridgelabz.LoginPage.forgotPassword;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.LoginPage.DAOImplimentation;
import com.bridgelabz.LoginPage.model.LoginModel;

public class forgotPassword extends HttpServlet{

	
	public void doGet(HttpServletRequest request,HttpServletResponse response) {
		int i=0;
		DAOImplimentation daoObject=new DAOImplimentation();
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String password=request.getParameter("password");
		String RePassword=request.getParameter("RePassword");
		
		LoginModel loginModel=daoObject.getData(email,mobile);
		if(loginModel!=null) {
			loginModel.setPwd(password);
			 i=daoObject.alterUser(email,password);
			if(i!=0) {
			HttpSession session=request.getSession();
			session.setAttribute("email","password change");
			try {
				response.sendRedirect("LoginPage.jsp");
			} catch (IOException e) {				
				e.printStackTrace();
			}
			}
		}
		else {
			request.setAttribute("notchanged","Password not changed");
			request.getRequestDispatcher("forgotPassword.jsp");
		
		}
	}
}
