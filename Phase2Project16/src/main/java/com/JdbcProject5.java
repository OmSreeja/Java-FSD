package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JdbcProject5
 */
public class JdbcProject5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JdbcProject5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			out.println("Driver Loaded Successfully...");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root","sreeja7340");
			out.println("Connected Successfully...");
			Statement stmt=con.createStatement();
			out.println("Statement is Ready...");
			int result=stmt.executeUpdate("create database students2");
			if(result>0)
			{
				out.println("Created Successfully");
			}
			int result1=stmt.executeUpdate("use students2");
			int result2=stmt.executeUpdate("drop database students2");
			if(result2>0) {
				out.println("dropped successfully");
			}
			
			con.close();
		}
		catch(Exception e) {
			out.println(e);
	}
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
