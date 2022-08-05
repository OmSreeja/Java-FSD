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
 * Servlet implementation class JdbcProject7
 */
public class JdbcProject7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JdbcProject7() {
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
			int result=stmt.executeUpdate("insert into employee values(8,'Aneesha',30000)");
			if(result>0)
			{
				out.println("Inserted Successfully");
			}
			int result1=stmt.executeUpdate("delete from employee where salary=30000");
			if(result>0)
			{
				out.println("Deleted Successfully");
			}
			else
			{
				System.out.println("Record Not Present");
			}
			int result2=stmt.executeUpdate("update employee set salary = 50000 where id=1");
			if(result>0)
			{
				out.println("Updated Successfully");
			}
			else
			{
				out.println("Record Not Present");
			}
			ResultSet rs=stmt.executeQuery("select * from employee");
			while(rs.next())
			{
				out.println("id is " +rs.getInt("id")+" name is "+rs.getString("name")+" Salary is "+rs.getFloat("salary"));
			}
		stmt.close();
		con.close();
		rs.close();
		}
		catch(Exception e)
		{
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
