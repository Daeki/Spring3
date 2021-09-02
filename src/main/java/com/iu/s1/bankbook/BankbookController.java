package com.iu.s1.bankbook;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bankbook/*")
public class BankbookController {
	
	@Autowired
	private BankBookService bankBookService;
	
	
	@RequestMapping("bankbookList")
	public ModelAndView list(ModelAndView mv) {
		
		List<BankBookDTO> ar = bankBookService.getList();
		
		mv.addObject("list", ar);
		mv.setViewName("bankbook/bankbookList");
		
		return mv;
	}
	
	@RequestMapping("bankbookSelect")
	public void select(HttpServletRequest request, BankBookDTO bankBookDTO, Model model) {
//		String bn = request.getParameter("bookNumber");
//		long l = Long.parseLong(bn);
//		BankBookDTO banDto = new BankBookDTO();
//		banDto.setBookNumber(l);
		System.out.println("select");
		System.out.println(bankBookDTO.getBookNumber());
		
		bankBookDTO = bankBookService.getSelect(bankBookDTO);
		System.out.println("Name : "+bankBookDTO.getBookName());
		model.addAttribute("dto", bankBookDTO);
	}
	
	@RequestMapping(value="bankbookInsert", method = RequestMethod.GET)
	public void insert() {}
	
	@RequestMapping(value="bankbookInsert", method = RequestMethod.POST)
	public String insert(BankBookDTO bankBookDTO) {
		int result = bankBookService.setInsert(bankBookDTO);
		
		return "redirect:./bankbookList";
		
	}
	

}
