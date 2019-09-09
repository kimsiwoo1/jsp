package kr.or.ddit.mvc.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.mvc.model.UrlMapping;

public class UrlMappingDaoTest {
	private static final Logger logger = LoggerFactory.getLogger(UrlMappingDaoTest.class);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void getUrlMappingTest() {
		/***Given***/
		IUrlMappingDao dao  = new UrlMappingDao();
		
		/***when***/
		List<UrlMapping> list = dao.getUrlMapping();
		logger.debug("list: {} ", list);
		
		/***Then***/
		assertEquals(2, list.size());
	}

}
