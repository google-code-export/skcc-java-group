package com.skcc.javagroup.myweb;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


public class LoginServlet extends HttpServlet {        
        private String _id = null;
        private String _pw = null;
        private static final long serialVersionUID = -8431430892643244256L;

        @Override
		public void init() throws ServletException {
			super.init();
		}

		private void _service(HttpServletRequest request, HttpServletResponse response) {
                String id = request.getParameter("id");
                String pw = request.getParameter("pw");
                String url = "";
                
                
                ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
                UserService userService = context.getBean(UserService.class);
                
                User user = userService.getUser(id);
                
                if (user != null) {                        
                        if (user.getPassword().equals(pw)) {     
                        		url = "/main.jsp";
                        } else {                                
                                request.setAttribute("msg", "패스워드를 확인하시기 바랍니다.");
                                url = "/login.jsp";                                
                        }                        
                } else {
                        request.setAttribute("msg", "아이디를 확인하시기 바랍니다.");                        
                        url = "/login.jsp";
                }
                RequestDispatcher dispatcher = request.getRequestDispatcher(url);
                
                try {
                        dispatcher.forward(request, response);
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) {
            _service(request, response);
        }       

        protected void doPost(HttpServletRequest request, HttpServletResponse response) {
                _service(request, response);
        }

        public void init(ServletConfig config) throws ServletException {
                   _id  = config.getInitParameter("id");
                   _pw  = config.getInitParameter("pw");
        }
}
                
