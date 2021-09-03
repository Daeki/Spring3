package com.iu.s1.bankbook;




import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s1.util.Pager;

@Repository
public class BankBookDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s1.bankbook.BankBookDAO.";
	
	public int setUpdate(BankBookDTO bankBookDTO) {
		return sqlSession.update(NAMESPACE+"setUpdate", bankBookDTO);
	}
	
	public int setDelete(Long bookNumber) {
		return sqlSession.delete(NAMESPACE+"setDelete", bookNumber);
	}
	
	public int setInsert(BankBookDTO bankBookDTO) {
		return sqlSession.insert(NAMESPACE+"setInsert", bankBookDTO);
	}
	
	public List<BankBookDTO> getList(Pager pager){
		return sqlSession.selectList(NAMESPACE+"getList", pager);
	}
	
	public BankBookDTO getSelect(BankBookDTO bankBookDTO) {
		System.out.println("DAO : "+bankBookDTO.getBookNumber());
		return sqlSession.selectOne(NAMESPACE+"getSelect", bankBookDTO);
	}
	

}
