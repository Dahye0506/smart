package controller.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MainController extends HttpServlet 
							implements Servlet{
	
	public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestURI=request.getRequestURI();
		String contextPath=request.getContextPath();
		String command=requestURI.substring(contextPath.length());
		
		/// uri= /shopping/index.html
		/// context = /shopping
		
		if(command.equals("/main.sm")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("main/home.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/login.sm")) {
			LoginPage action = new LoginPage();
			action.login(request);
			response.sendRedirect("main.sm");
		}else if(command.equals("/logout.sm")) {
			HttpSession session = request.getSession();
			session.invalidate();
			response.sendRedirect("main.sm");
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
}