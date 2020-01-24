package com.bridgelabz.user;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.LoginPage.DAOImplimentation;
import com.bridgelabz.LoginPage.model.LoginModel;

public class Update extends HttpServlet {
public void doPost(HttpServletRequest request,HttpServletResponse response)
{
	DAOImplimentation daoObject=new DAOImplimentation();
	 
	String fname=request.getParameter("FirstName");
	String lname=request.getParameter("LastName");
	String email=request.getParameter("email");
	String mobile=request.getParameter("mobile");
	String age=request.getParameter("age");
	String gender=request.getParameter("gender");
	String location=request.getParameter("location");
	LoginModel modelObject=new LoginModel();
	modelObject=daoObject.getData(email, mobile);
	System.out.println(request.getParameter("FirstName"));
	if(modelObject!=null) {
		
		if(!fname.equals("")) {
			
			modelObject.setFirstName(fname);
		}
		if(!lname.equals("")) {
			modelObject.setLastName(lname);
		}
		if(!age.equals("")) {
			modelObject.setAge(age);
		}
		if(!gender.equals("")) {
			modelObject.setGender(gender);
		}
		if(!location.equals("")) {
			modelObject.setLocation(location);
		}		
	}
	System.out.println(modelObject.getFirstName());
	String qry="UPDATE customer SET FirstName='"+modelObject.getFirstName()+"' LastName='"+modelObject.getLastName()+"' gender='"+modelObject.getGender()+"' age='"+modelObject.getAge()+"' location='"+modelObject.getLocation()+"' WHERE email='"+email+"';";
	int status=daoObject.update(qry);
	if(status!=0) {
		request.getRequestDispatcher("Welcome.jsp");
	}
	else {
		request.getRequestDispatcher("Update.jsp");
	}
	}
}
