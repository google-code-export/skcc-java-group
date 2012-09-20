

import java.io.IOException;
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
			request.setAttribute("operator", op);
			request.setAttribute("num1", num1);
			request.setAttribute("num2", num2);
			request.setAttribute("result", result);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}

}
