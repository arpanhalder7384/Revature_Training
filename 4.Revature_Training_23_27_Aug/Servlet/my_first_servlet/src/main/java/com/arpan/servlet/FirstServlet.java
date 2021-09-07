package com.arpan.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FirstServlet() {
        // TODO Auto-generated constructor stub
    }
    
    
//    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//    	response.setContentType("text/html");
//    	PrintWriter out=response.getWriter();
//    	out.print("<h1>Welcome to service() methods of Servlet</h1>");
//    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
    	PrintWriter out=response.getWriter();
    	out.print("<h1>Welcome to doGet() methods of Servlet</h1>");
    	out.print("<h2>Welcome....."+request.getParameter("fname")+"<h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		response.setContentType("text/html");
    	PrintWriter out=response.getWriter();
    	out.print("<h1>Welcome to doPost() methods of Servlet</h1>");
    	out.print("<h2>Welcome....."+request.getParameter("fname")+"<h2>");
    	out.print("<h2>Age: "+request.getParameter("age")+"<h2>");
    	out.print("<h2>Gender: "+request.getParameter("gender")+"<h2>");
    	out.print("<h2>Country: "+request.getParameter("country")+"<h2>");
    	out.print("<h2>Hobbies: "+Arrays.toString(request.getParameterValues("hobby"))+"<h2>");
	}

}
