package kr.or.ddit.user.repository;

import java.util.ArrayList;
import java.util.List;

import kr.or.ddit.user.model.UserVo;

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
		//가짜 객체 리턴
		List<UserVo> userList = new ArrayList<UserVo>();
		userList.add(new UserVo("brown"));
		userList.add(new UserVo("brown2"));
		userList.add(new UserVo("brown3"));
		userList.add(new UserVo("brown4"));
		userList.add(new UserVo("brown5"));
		
		return userList;
	}

}
