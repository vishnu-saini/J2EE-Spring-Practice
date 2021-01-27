package com.example.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.AtmVerifyRemote;

@WebServlet("/test2")
public class TestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@EJB	
	private AtmVerifyRemote bean;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("result is : ").append(""+ bean.isValid("121233"));
	}

}
