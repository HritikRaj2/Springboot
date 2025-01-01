package servlets;
import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/first")
public class FirstServlet implements Servlet{
	private ServletConfig servletConfig;
	//life cycle methods 
	@Override
	public void destroy() {
		System.out.println("Destroying servlet");
		
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		this.servletConfig=arg0;
		System.out.println("Initializing servlet");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Service Request");
		
	}
	//non life cycle methods 
	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}

	@Override
	public String getServletInfo() {
		return "This servlet is made by Hritik Raj";
	}


}
