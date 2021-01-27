package com.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.persistance.Customer;
import com.model.persistance.Dog;

public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Dog dog = new Dog("stonish");
		Customer customer = new Customer("raja", "delhi", 499000, dog);
		request.setAttribute("customer", customer);
		
		RequestDispatcher rd = request.getRequestDispatcher("EL_Expression.jsp");
		rd.forward(request, response);
	}

}
