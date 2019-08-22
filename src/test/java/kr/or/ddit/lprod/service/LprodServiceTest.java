package kr.or.ddit.lprod.service;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.Lprod;
import kr.or.ddit.lprod.repository.ILprodDao;
import kr.or.ddit.lprod.repository.LprodDaoImpl;
import kr.or.ddit.lprod.repository.LprodDaoTest;
import kr.or.ddit.user.model.User;
import kr.or.ddit.util.MybatisUtil;

public class LprodServiceTest {
	private ILprodService service;
	
	@Before
	public void setup() {
		service = new LprodService();
	}
	
	@Test
	public void getAllLprodTest() {
		/***Given***/
		
		
		/***When***/
		List<Lprod> lprodList = service.getAllLprod();
		
		/***Then***/
		assertEquals(10, lprodList.size());
	}
	
	@Test
	public void getLprodPagingListTest() {
		/*** Given ***/
		Page page = new Page();
		page.setPage(1);
		page.setPagesize(5);

		/*** When ***/
		Map<String, Object> resultMap = service.getLprodPagingList(page);
		List<Lprod> lprodList = (List<Lprod>)resultMap.get("lprodList");
		int paginationSize = (Integer)resultMap.get("paginationSize");

		/*** Then ***/
		assertEquals(5, lprodList.size());
		assertEquals(2, paginationSize);
		
	}


}
