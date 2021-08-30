package com.iu.s1.bankbook;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/bankbook/*")
public class BankbookController {
	//pojo (plain Old Java Object) 
	
	@RequestMapping(value = "bankbookList.do", method = RequestMethod.GET)
	public String list() {
		System.out.println("bankbook list");
		return "bankbook/bankbookList";
	}
	
	@RequestMapping("bankbookSelect.do")
	public String select(int num, String name) {
		
		System.out.println("Value: "+num);
		System.out.println("Name : "+name);
		return "bankbook/bankbookSelect";
	}
	

}
