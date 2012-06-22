package com.skcc.javagroup.myweb;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.XmlViewResolver;

@Controller
public class UserController {

	@Resource
	UserService userService;
	
	@RequestMapping("/login.form")
	public ModelAndView login(String id, String pw){
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", id);
		String url;
		User user = userService.getUser(id);
		if(user != null) {
			if(user.getPassword().equals(pw)){
				url = "main.jsp";
			}else{
				mv.addObject("msg", "�н����带 Ȯ���Ͻñ� �ٶ��ϴ�.");
				url = "login.jsp";
			}
		}else{
			mv.addObject("msg", "���̵� Ȯ���Ͻñ� �ٶ��ϴ�.");
			url = "login.jsp";
		}
		mv.setViewName(url);
		return mv;
	}
	
	@RequestMapping("/user/{name}")
	public ModelAndView getUser(@PathVariable String name){
		ModelAndView mv = new ModelAndView("jaxbView", BindingResult.MODEL_KEY_PREFIX +"response", userService.getUser(name));
		return mv;
	}
}
