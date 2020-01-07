package com.bridgelabz.user;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.LoginPage.DAOImplimentation;

public class Graph extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) {
		DAOImplimentation daoImplimentationObject=new DAOImplimentation();
		String graph=(String) request.getAttribute("Graph"); 
		String data[]=daoImplimentationObject.Graph(graph);
		request.setAttribute("graph",data);
		request.getRequestDispatcher("Welcome.jsp");
	}
}
