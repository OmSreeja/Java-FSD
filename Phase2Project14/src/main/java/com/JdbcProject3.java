package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JdbcProject3
 */
public class JdbcProject3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JdbcProject3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			pw.println("Driver Loaded Successfully...");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root","sreeja7340");
			pw.println("Connected Successfully...");
			Statement stmt=con.createStatement();
			pw.println("Statement is Ready...");
			//int result=stmt.executeUpdate("insert into employee values(7,'bhavs',55000)");
			//if(result>0)
			//{
				//pw.println("Inserted Successfully");
			//}
			//else {
				//pw.println("failure");
			//}
			ResultSet rs=stmt.executeQuery("select * from employee");
			while(rs.next())
			{
				pw.println("id is " +rs.getInt("id")+" name is "+rs.getString("name")+" Salary is "+rs.getFloat("salary"));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);

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
