package kr.or.ddit.prod.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


import kr.or.ddit.prod.model.Prod;

public class prodDaoTest {

	@Test
	public void getProdListTest() {
		String lprod_gu = "P101";
		/***Given***/
		IProdDao prodDao = new ProdDao();
		
		/***When***/
		List<Prod> prodList = prodDao.getProdList(lprod_gu);
		
		/***Then***/
		assertEquals(6, prodList.size());
	}

}
