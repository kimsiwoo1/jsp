package kr.or.ddit.lprod.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import kr.or.ddit.lprod.model.Lprod;


public class LprodDaoTest {

	@Test
	public void getAllLprodTest() {
		/***Given***/
		ILprodDao lprodDao = new LprodDaoImpl();
		
		/***When***/
		List<Lprod> lprodList = lprodDao.getAllLprod();
		
		/***Then***/
		assertEquals(10, lprodList.size());
	}

}
