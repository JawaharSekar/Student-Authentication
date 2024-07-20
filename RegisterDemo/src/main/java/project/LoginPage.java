package project;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginPage extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email =  req.getParameter("email");
		String pass =req.getParameter("pass");
		String url="jdbc:mysql://localhost:3306/student_register";
		String user="root";
		String password="Jawahar@1410";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement ps= con.prepareStatement("SELECT * FROM register WHERE email=? AND password=?");
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			PrintWriter out = resp.getWriter();
			
			if(rs.next()) {
				resp.setContentType("text/html");
				HttpSession session=req.getSession();
				session.setAttribute("session_name",rs.getString("name"));
				RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
				rd.include(req, resp);
			}
			else {
				resp.setContentType("text/html");
		//	out.print("<h3 style='colour:red'>Login Not Successfull Please Check The Details</h3> ");
				RequestDispatcher rd=req.getRequestDispatcher("/New.jsp");
				rd.include(req, resp);
			
			}
			
		}
		catch(Exception e) {

	}
}
	}
