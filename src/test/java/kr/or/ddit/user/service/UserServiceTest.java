package kr.or.ddit.user.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.ddit.user.model.User;

public class UserServiceTest {
	private IUserService userService;
	@Before
	public void setup() {
		userService = new UserService();
	}

	/**
	 * 
	* Method : getUserListTest
	* 작성자 : PC-07
	* 변경이력 :
	* Method 설명 : getUserList 테스트
	 */
	@Test
	public void getUserListTest() {
		/***Given***/
		
		/***When***/
		List<User> userList = userService.getUserList();
		
		/***Then***/
		assertEquals(105, userList.size());
	}
	
	/**
	 * 
	* Method : getUserTest
	* 작성자 : PC-07
	* 변경이력 :
	* Method 설명 : 사용자 정보 조회 테스트
	 */
	@Test
	public void getUserTest() {
		/***Given***/
		String userId = "brown";
		
		/***When***/
		User userVo = userService.getUser(userId);
		
		/***Then***/
		assertEquals("브라운", userVo.getUserNm());
		assertEquals("brown1234", userVo.getPass());
	}
	
	@Test
	public void getCntUserListTest() {
		/***Given***/
		
		/***When***/
		List<User> userList = userService.getCntUserList();
		
		/***Then***/
		assertEquals(50, userList.size());
		System.out.println(userList);
	}

}
