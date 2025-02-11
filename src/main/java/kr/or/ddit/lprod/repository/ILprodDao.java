package kr.or.ddit.lprod.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.Lprod;

public interface ILprodDao {
	public List<Lprod> getAllLprod();
	
	public List<Lprod> getLprodPagingList(SqlSession sqlSession, Page page);
	
	int getUserTotalCnt(SqlSession sqlSession);
}
