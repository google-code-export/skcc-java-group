

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("CalculatorServlet DoGet!!!");
		double num1 = Double.parseDouble(request.getParameter("num1"));
		double num2 = Double.parseDouble(request.getParameter("num2"));
		double result = 0;
		String op = request.getParameter("operator");
		
		// for using counting digit
		String result1 = null;
		String num3 = request.getParameter("num1");
		String num4 = request.getParameter("num2");
		
		// define digit variable
		int num_cnt = 0;

		// initiate digit count variable & check longer digit and setting digit count variable
		if((num3.indexOf(".") == -1) && (num4.indexOf(".") == -1)){
			num_cnt = 2;
		}else{
			if(num3.indexOf(".") != -1)
				num_cnt = num3.length()-num3.indexOf(".")-1;
			if(num4.indexOf(".") > num_cnt)
				num_cnt = num4.length()-num4.indexOf(".")-1;
		}
		
		// branch calculation
		if(op.equals("/")){
			result = (double) num1 / (double) num2;
			// change result variable format double to string
			NumberFormat nf = NumberFormat.getNumberInstance();
			nf.setMaximumFractionDigits(num_cnt);
			nf.setGroupingUsed(false);
			result1 = nf.format(result);
			request.setAttribute("result", result1);
		}else{
			if(op.equals("+")){
				result = (double) num1 + (double) num2;
			}else if(op.equals("-")){
				result = (double) num1 - (double) num2;
			}else if(op.equals("*")){
				result = (double) num1 * (double) num2;
			}
			request.setAttribute("result", result);
		}		
		request.getRequestDispatcher("./index.jsp").forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("CalculatorServlet DoPost!!!");
		if(request.getParameter("num1").equals("")){
			response.sendRedirect("/webapp/index.jsp");
		}else if(request.getParameter("num2").equals("")){
			response.sendRedirect("/webapp/index.jsp");
		}else if(request.getParameter("operator").equals("")){
			response.sendRedirect("/webapp/index.jsp");
		}else{
			int num1 = Integer.parseInt(request.getParameter("num1"));
			int num2 = Integer.parseInt(request.getParameter("num2"));
			String op = request.getParameter("operator");
			int result = 0; 
			
			if(op.equals("plus")){
				result = num1 + num2;
			}else if(op.equals("minus")){
				result = num1 - num2;
			}else if(op.equals("multi")){
				result = num1 * num2;
			}else{
				result = num1 / num2;
			}
			
			request.setAttribute("num1", num1);
			request.setAttribute("num2", num2);
			request.setAttribute("operator", op);
			request.setAttribute("result", result);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}
}
