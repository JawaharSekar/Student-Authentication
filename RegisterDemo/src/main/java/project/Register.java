package project;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/registerForm")
public class Register extends HttpServlet {



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("uname");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String url="jdbc:mysql://localhost:3306/student_register";
		String user="root";
		String password="Jawahar@1410";
		PrintWriter out = response.getWriter(); 
	
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	      Connection con = DriverManager.getConnection(url,user,password);
		
		PreparedStatement ps = con.prepareStatement("INSERT INTO register VALUES(?,?,?)");
		ps.setString(1,name);
		ps.setString(2, email);
		ps.setString(3, pass);
		
		int result = ps.executeUpdate();
		if(result>0)
		{
			response.setContentType("text/html");
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			rd.include(request, response);
			out.println("<h3 style= 'color:green'>Successfully register</h3>");
		}
		
		else
		{
			response.setContentType("text/html");
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			rd.include(request, response);
			out.println("<h3 style= 'color:red'>Not registered </h3>");
		}
	}
	catch(Exception e)
	{
		response.setContentType("text/html");
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.include(request, response);
		out.println("<h3 style= 'color:red'>Not registered please fill all details</h3>");
	}

}
}