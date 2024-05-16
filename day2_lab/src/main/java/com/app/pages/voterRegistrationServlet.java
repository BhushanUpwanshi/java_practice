package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.UserDaoImpl;
import com.app.entities.User;


/**
 * Servlet implementation class voterRegistrationServlet
 */
@WebServlet("/voter_register")
public class voterRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDaoImpl userDao;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		System.out.println("In init -"+ getClass());
		try {
			userDao = new UserDaoImpl();
		}catch(Exception e) {
			throw new ServletException("Error in -"+e);
		}
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			userDao.cleanUp();
		}catch(Exception e) {
			System.out.println("Errror in - "+getClass());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter pw = response.getWriter() ){
//			String firstName, String lastName, 
//			String email, String password, Date dob
			String firstName=request.getParameter("fn");
			String lastName =  request.getParameter("ln");
			String email=request.getParameter("em");
			String password=request.getParameter("pass");
			Date dob=Date.valueOf(LocalDate.parse(request.getParameter("dob") ));
			
			String s1 =userDao.voterRegistration(new User(firstName, lastName, email, password, dob));
			
			if(s1!=null) {
			pw.print("<h4>"+s1+"</h4>");
			response.sendRedirect("login.html");
			}
//			else {
//				
//			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ServletException("err in servicing - "+ getClass(),e);
		}
		
	}

}
