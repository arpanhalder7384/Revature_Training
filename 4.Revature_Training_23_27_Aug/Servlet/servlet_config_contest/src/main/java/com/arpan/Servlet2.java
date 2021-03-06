package com.arpan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<h2>Accessing ServletConfig params of Servlet1 in Servlet2</h2> ");
		ServletConfig config=getServletConfig();
		out.print("<h3>Query1 : "+config.getInitParameter("query1")+"</h3>");
		out.print("<h3>Query2 : "+config.getInitParameter("query2")+"</h3>");
		out.print("<h3>Query3 : "+config.getInitParameter("query3")+"</h3>");
		
		out.print("<h2>Accessing ServletContext params in Servlet2</h2> ");
		ServletContext context=getServletContext();
		out.print("<h3>URL : "+context.getInitParameter("url")+"</h3>");
		out.print("<h3>DRIVER : "+context.getInitParameter("driver")+"</h3>");
	}

}
