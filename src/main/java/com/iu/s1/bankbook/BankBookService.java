package com.iu.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s1.util.Pager;

@Service
public class BankBookService {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	public int setUpdate(BankBookDTO bankBookDTO) {
		return bankBookDAO.setUpdate(bankBookDTO);
	}
	
	public int setDelete(Long bookNumber) {
		return bankBookDAO.setDelete(bookNumber);
	}
	
	public int setInsert(BankBookDTO bankBookDTO) {
		return bankBookDAO.setInsert(bankBookDTO);
	}
	
	public List<BankBookDTO> getList(Pager pager){
		//totalCount 구하기
		Long totalCount = bankBookDAO.getCount();
		pager.makeNum(totalCount);
		pager.makeRow();
		return bankBookDAO.getList(pager);
	}
	
	public BankBookDTO getSelect(BankBookDTO bankBookDTO) {
		System.out.println("Service : "+bankBookDTO.getBookNumber());
		return bankBookDAO.getSelect(bankBookDTO);
	}

}
