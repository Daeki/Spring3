package com.iu.s1.bankbook;

import java.util.ArrayList;

public class BankbookService {
	
	private BankBookDAO bankBookDAO;
	
	public BankbookService() {
		bankBookDAO = new BankBookDAO();
	}
	
	public ArrayList<BankBookDTO> getList() {
		 ArrayList<BankBookDTO> ar = bankBookDAO.getList();
		 return ar;
	}
	

}
