package kr.or.ddit.lprod.repository;

import java.util.List;

import kr.or.ddit.lprod.model.Lprod;



public class LprodDaoMainTest {
	public static void main(String[] args) {
		ILprodDao lprodDao = new LprodDaoImpl();
		
		List<Lprod> lprodList = lprodDao.getAllLprod();
		
		if(lprodList.size() == 10)
			System.out.println("db 조회 성공");
		else
			System.out.println("db 조회 실패");
	}
}
