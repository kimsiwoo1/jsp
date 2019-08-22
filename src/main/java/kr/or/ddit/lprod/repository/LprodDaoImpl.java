package kr.or.ddit.lprod.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.Lprod;
import kr.or.ddit.util.MybatisUtil;

public class LprodDaoImpl implements ILprodDao {

	@Override
	public List<Lprod> getAllLprod() {
		SqlSession session = MybatisUtil.getSession();
		
		List<Lprod> list = session.selectList("lprod.getAllLprod");
		session.close();
		return list;
	}

	@Override
	public List<Lprod> getLprodPagingList(SqlSession sqlSession, Page page) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("lprod.getLprodPagingList", page);
	}

	@Override
	public int getUserTotalCnt(SqlSession sqlSession) {
		return sqlSession.selectOne("lprod.getUserTotalCnt");
	}

}
