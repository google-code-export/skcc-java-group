package egovframework.lab.com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.util.WebUtils;

import egovframework.lab.com.vo.Account;


public class AuthenticInterceptor extends HandlerInterceptorAdapter {
	
	/**
	 * 세션에 계정정보(Account)가 있는지 여부로 인증 여부를 체크한다.
	 * 계정정보(Account)가 없다면, 로그인 페이지로 이동한다.
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {		
		
		Account account = (Account) WebUtils.getSessionAttribute(request, "UserAccount");
		
		if(account!=null){
			return true;
		}else{
			ModelAndView modelAndView = new ModelAndView("redirect:login.do");			
			throw new ModelAndViewDefiningException(modelAndView);
		}
	}

}
