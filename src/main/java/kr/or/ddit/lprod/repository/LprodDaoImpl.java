package kr.or.ddit.lprod.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

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
	public Lprod getLprod(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
