package com.skcc;

import java.io.IOException;
import java.math.BigDecimal;

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
	
	Float val1=Float.parseFloat(request.getParameter("val1"));
	Float val2=Float.parseFloat(request.getParameter("val2"));
	String op = request.getParameter("operator");
	
	int po = 2;
	
	int length1= request.getParameter("val1").length();
	int length2= request.getParameter("val2").length();
	int point1= request.getParameter("val1").indexOf(".");
	int point2= request.getParameter("val2").indexOf(".");
	
	Float result=0f;
	
	System.out.println("---------------------");
	System.out.println("val1= "+val1);
	System.out.println("val2= "+val2);
	System.out.println("length1= "+length1);
	System.out.println("length2= "+length2);
	System.out.println("point1= "+point1);
	System.out.println("point2= "+point2);
	
	
	if ((length1-point1)>=(length2-point2)){
		if (point1 == -1){
			po = 2;
		}else{
			po= length1 - point1 -1;
		}
	}else{
			po= length2 - point2 -1;
	}
	
	System.out.println("po= "+po);
	
	
	
	if (op.equals("*")){
		result= val1*val2;
		
		request.setAttribute("res",result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
		
	}else if(op.equals("+")){
		result= val1+val2;	
		
		request.setAttribute("res",result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
		
	}else if(op.equals("-")){
		result= val1-val2;	
		
		request.setAttribute("res",result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
		
	}else if(op.equals("/")){
		
		
		BigDecimal bd1 =new BigDecimal(val1);
		BigDecimal bd2 =new BigDecimal(val2);
		BigDecimal devide;
		
		devide = bd1.divide(bd2,po,BigDecimal.ROUND_CEILING);
		
		request.setAttribute("res",devide);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	
		System.out.println("devide="+ devide );
		
	}
	
	
	

	System.out.println("result="+ result );
	
	
	
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	
}
