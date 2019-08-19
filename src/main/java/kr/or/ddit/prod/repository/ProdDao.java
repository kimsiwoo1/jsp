package kr.or.ddit.prod.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.prod.model.Prod;
import kr.or.ddit.util.MybatisUtil;

public class ProdDao implements IProdDao {

	@Override
	public List<Prod> getProdList(String lprod_gu) {
		SqlSession session = MybatisUtil.getSession();
		
		List<Prod> list = session.selectList("prod.getProdList", lprod_gu);
		session.close();
		return list;
	}

}
