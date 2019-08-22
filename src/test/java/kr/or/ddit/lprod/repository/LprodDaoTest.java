package kr.or.ddit.lprod.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.Lprod;
import kr.or.ddit.user.model.User;
import kr.or.ddit.user.repository.IUserDao;
import kr.or.ddit.user.repository.UserDao;
import kr.or.ddit.util.MybatisUtil;


public class LprodDaoTest {
	private SqlSession sqlSession;
	private LprodDaoImpl lprodDao;
	private static final Logger logger = LoggerFactory.getLogger(LprodDaoTest.class);
	
	@Before
	public void setup() {
		logger.debug("before");
		lprodDao = new LprodDaoImpl();
		sqlSession = MybatisUtil.getSession();
	}
	
	//테스트에 공통적으로 사용한 자원을 해제
	@After
	public void tearDown() {
		logger.debug("after");
		sqlSession.close();
	}
	
	@Test
	public void getAllLprodTest() {
		/***Given***/
		ILprodDao lprodDao = new LprodDaoImpl();
		
		/***When***/
		List<Lprod> lprodList = lprodDao.getAllLprod();
		
		/***Then***/
		assertEquals(10, lprodList.size());
	}
	
	@Test
	public void getLprodPagingListTest() {
		/***Given***/
		Page page = new Page();
		page.setPage(1);
		page.setPagesize(5);
		
		/***When***/
		List<Lprod> lprodList = lprodDao.getLprodPagingList(sqlSession, page);
		
		/***Then***/
		assertEquals(5, lprodList.size());
		//assertEquals("xuserid22", lprodList.get(0).getUserId());
		
	}

}
