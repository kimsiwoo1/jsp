package kr.or.ddit.lprod.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.Lprod;
import kr.or.ddit.lprod.repository.LprodDaoImpl;
import kr.or.ddit.util.MybatisUtil;

public class LprodService implements ILprodService {

	private LprodDaoImpl dao;
	
	public LprodService() {
		dao = new LprodDaoImpl();
	}
	
	@Override
	public List<Lprod> getAllLprod() {
		SqlSession sqlSession = MybatisUtil.getSession();
		List<Lprod> lprodList = dao.getAllLprod();
		sqlSession.close();
		return lprodList;
	}

	@Override
	public Map<String, Object> getLprodPagingList(Page page) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		SqlSession sqlSession = MybatisUtil.getSession();
		List<Lprod> lprodList = dao.getLprodPagingList(sqlSession, page);
		int totalCnt = dao.getUserTotalCnt(sqlSession);
		
		map.put("lprodList", lprodList);
		map.put("paginationSize", (int)Math.ceil((double)totalCnt / page.getPagesize()));
		sqlSession.close();
		return map;
	}

}
