package com.bridgelabz.LoginPage;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.bridgelabz.LoginPage.model.LoginModel;

@SuppressWarnings("serial")
public class Login extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		DAOImplimentation daoImplimentationObject=new DAOImplimentation();
		String user=request.getParameter("userId");
		String password=request.getParameter("pwd");
	
		LoginModel loginModel=daoImplimentationObject.getUser(user, password);						
		if(loginModel.getEmail()!=null) {
			HttpSession httpSession=request.getSession();
			httpSession.setAttribute("amresh",user);
			request.setAttribute("message", loginModel.getFirstName());
			
			request.getRequestDispatcher("Welcome.jsp").forward(request,response);
			
			

		}
		else {
			request.setAttribute("message1","data not found please register");
			request.getRequestDispatcher("LoginPage.jsp").forward(request, response);
		}		
	}
}
