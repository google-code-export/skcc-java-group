package com.skcc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calculator
 */
@WebServlet("/calculator")
public class calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	int val1=Integer.parseInt(request.getParameter("val1"));
	int val2=Integer.parseInt(request.getParameter("val2"));
	int result=0;
	String res ;
	String cal1=request.getParameter("cal");
	
	if (cal1.equals("*")){
		result= val1*val2;
	}else if(cal1.equals("+")){
		result= val1+val2;	
	}else if(cal1.equals("-")){
		result= val1-val2;	
	}else if(cal1.equals("/")){
		result= val1/val2;	
	}
	
	
	System.out.println(val1);
	System.out.println(val2);
	System.out.println(cal1);
	System.out.println(result);
	
	request.setAttribute("result",result);
	
	
	
	RequestDispatcher view = request.getRequestDispatcher("result.jsp");
	view.forward(request, response);
	
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	
}
