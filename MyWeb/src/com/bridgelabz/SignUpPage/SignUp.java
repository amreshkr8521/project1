package com.bridgelabz.SignUpPage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.LoginPage.DAOImplimentation;
import com.bridgelabz.LoginPage.model.LoginModel;

@SuppressWarnings("serial")
public class SignUp extends HttpServlet {
	static LoginModel model = new LoginModel();

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		DAOImplimentation daoImplImentationObject = new DAOImplimentation();
		String fName = request.getParameter("FirstName");
		String lName = request.getParameter("LastName");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String gender = request.getParameter("gender");
		String password = request.getParameter("password");
		String rePassword = request.getParameter("rePassword");
		String submit = request.getParameter("submit");
		if (password.equals(rePassword) && daoImplImentationObject.IsEmail(email) == false) {
			model.setFirstName(fName);
			model.setLastName(lName);
			model.setEmail(email);
			model.setLastName(mobile);
			model.setGender(gender);
			model.setPwd(password);
			int i = daoImplImentationObject.addUser(model);
			if (daoImplImentationObject.IsEmail(email)) {
				request.setAttribute("warning1", email + "is registered , try another email");
				try {
					request.getRequestDispatcher("SignUP.jsp").forward(request, response);
				} catch (ServletException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (password != rePassword) {
				request.setAttribute("warning", "Password Not MatchdaoImplImentationObject");
				try {
					request.getRequestDispatcher("SignUP.jsp").forward(request, response);
				} catch (ServletException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (i == 0) {

				try {
					request.setAttribute("DATABASE_WARNING", "Not registered Please try later");
					request.getRequestDispatcher("SignUP.jsp").forward(request, response);
				} catch (ServletException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				try {
					request.setAttribute("ADDED_IN_DATABASE", "Added successfully");
					request.getRequestDispatcher("LoginPage.jsp").forward(request, response);
				} catch (ServletException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
