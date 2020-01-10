package com.bridgelabz.user;

import java.io.PrintWriter;
import java.util.LinkedList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.LoginPage.DAOImplimentation;

public class MaleList extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) {
		DAOImplimentation daoimplimentation=new DAOImplimentation();
		LinkedList<?> object=daoimplimentation.male();
		String d=object.toString();
		String[] str=d.split(" ");
		request.setAttribute("graph",object);
		try {
			PrintWriter out=response.getWriter();			
			out.print("<link rel=\"stylesheet\"\n" + 
					"	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">");	
			out.print("<ul class="+"list-group"+">");
			for(int count=0;count<str.length;count++) {
				out.print("<li class="+"list-class-item"+">"+str[count]+"</li>");
			}
			out.print("</ul>");
		}catch(Exception e) {
			
		}
	}
}
