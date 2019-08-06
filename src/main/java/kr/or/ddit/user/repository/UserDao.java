package kr.or.ddit.user.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.util.MybatisUtil;

public class UserDao implements IUserDao{
	
	
	/**
	* Method : getUserList
	* 작성자 : PC-07
	* 변경이력 :
	* @return
	* Method 설명 : 사용자 전체 리스트 조회
	*/
	@Override
	public List<UserVo> getUserList() {
//		//가짜 객체 리턴
//		List<UserVo> userList = new ArrayList<UserVo>();
//		userList.add(new UserVo("brown"));
//		userList.add(new UserVo("brown2"));
//		userList.add(new UserVo("brown3"));
//		userList.add(new UserVo("brown4"));
//		userList.add(new UserVo("brown5"));
		
		SqlSession sqlSession = MybatisUtil.getSession();
		List<UserVo> userList = sqlSession.selectList("user.getUserList");
		sqlSession.close();
		
		return userList;
	}
	
	/**
	 * 
	* Method : getUser
	* 작성자 : PC-07
	* 변경이력 :
	* @param userId
	* @return
	* Method 설명 : userId를 갖는 사용자 정보 조회
	 */
	@Override
	public UserVo getUser(String userId) {
		SqlSession sqlSession = MybatisUtil.getSession();
		UserVo userVo = sqlSession.selectOne("user.getUser", userId);
		sqlSession.close();
		return userVo;
	}

}
