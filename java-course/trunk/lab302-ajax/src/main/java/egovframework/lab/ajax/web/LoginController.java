package egovframework.lab.ajax.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.lab.ajax.service.LoginService;
import egovframework.lab.com.vo.Account;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping("/login.do")
	public void login() {

	}

	@RequestMapping("/loginProcess.do")
	public String login(HttpServletRequest request, @RequestParam("id") String id,
	                    @RequestParam("password") String password,ModelMap model) {

		Account account;
		try {
			account = (Account) loginService.authenticate(id, password);
		} catch (Exception e) {
			return "login";
		}
		request.getSession().setAttribute("UserAccount", account);

		return "redirect:/employeelist.do";

	}
}
