package com.skcc.json.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.skcc.json.service.Shop;

@Controller
public class JSONController {

//	@RequestMapping(value="/shopstaffdata.do")
//	@ResponseBody 
//	public Shop getShopInJSON() {
//
//		Shop shop = new Shop();
//		shop.setName("Json 공장");
//		shop.setStaffName(new String[]{"김민정", "박철수"});
//		
//		return shop;
//	}
}
