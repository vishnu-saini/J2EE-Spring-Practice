package com.example.servlet;

import java.io.IOException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.AtmVerifyRemote;

@WebServlet("/test1")
public class TestServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	// this bean Dependency resolution using JNDI lookup
	private AtmVerifyRemote bean;

	@Override
	public void init() throws ServletException {
		super.init();
		try {
			// bean Dependency resolution using JNDI lookup
			InitialContext ctx = new InitialContext();
			bean = (AtmVerifyRemote) ctx.lookup("java:global/EJB-Remote/AtmVerify!com.example.AtmVerifyRemote");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("result is : ").append(""+ bean.isValid("121233"));
	}

}
