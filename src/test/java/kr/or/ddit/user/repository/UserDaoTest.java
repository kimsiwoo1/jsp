package kr.or.ddit.user.repository;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.user.model.User;
import kr.or.ddit.util.MybatisUtil;

public class UserDaoTest {
	private static final Logger logger = LoggerFactory.getLogger(UserDaoTest.class);
	
	private IUserDao userDao;
	private SqlSession sqlSession;
	
	private String userId = "brownTest";
	//junit 테스트 메소드 실행 순서
	//@Before -> @Test -> @After
	//@Test테스트 메소드가 실행되기 전에 @Before이 적용된 메소드를 먼저 실행하고, @Test 메소드 실행 후
	//@After이 적용된 메소드를 실행한다
	//@Test 메소드는 실행순서가 보장되지 않음
	
	//테스트에 공통적으로 필요한 자원을 생성 / 초기화
	@Before
	public void setup() {
		logger.debug("before");
		userDao = new UserDao();
		sqlSession = MybatisUtil.getSession();
		
		userDao.deleteUser(sqlSession, userId);
	}
	
	//테스트에 공통적으로 사용한 자원을 해제
	@After
	public void tearDown() {
		logger.debug("after");
		sqlSession.close();
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
		List<User> userList = userDao.getUserList(sqlSession);
		
		/***Then***/
		assertEquals(108, userList.size());
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
		User userVo = userDao.getUser(sqlSession, userId);
		
		/***Then***/
		assertEquals("브라운", userVo.getUserNm());
		//assertEquals("brown1234", userVo.getPass());
	}
	
	@Test
	public void getCntUserListTest() {
		/***Given***/
		
		/***When***/
		List<User> userList = userDao.getCntUserList(sqlSession);
		
		/***Then***/
		assertEquals(50, userList.size());
		System.out.println(userList);
	}
	
	@Test
	public void getUserPagingListTest() {
		/***Given***/
		Page page = new Page();
		page.setPage(3);
		page.setPagesize(10);
		
		/***When***/
		List<User> userList = userDao.getUserPagingList(sqlSession, page);
		
		/***Then***/
		assertEquals(10, userList.size());
		//assertEquals("xuserid22", userList.get(0).getUserId());
		
	}
	
	/**
	* Method : getUserTotalCntTest
	* 작성자 : PC-07
	* 변경이력 :
	* Method 설명 :전체사용자 건수 조회 테스트
	*/
	@Test
	public void getUserTotalCntTest() {
		/***Given***/

		
		/***When***/
		int totalCnt = userDao.getUserTotalCnt(sqlSession);
		
		/***Then***/
		assertEquals(108, totalCnt);
		
	}
	
	@Test
	public void insertUserTest() throws ParseException {
		/***Given***/
		User user = new User();
		
	
		user.setUserId(userId);
		user.setUserNm("브라운테스트");
		user.setPass("brownTest1234");
		user.setReg_dt(new SimpleDateFormat("yyyy-MM-dd").parse("2019-08-08"));
		user.setAlias("곰테스트");
		user.setAddr1("대전광역시 중구 중앙로 76");
		user.setAddr2("영민빌딩 2층 DDIT");
		user.setZipcode("34940");
		
		
		/***When***/
		int insertCnt = userDao.insertUser(sqlSession, user);
		sqlSession.commit();
		
		/***Then***/
		assertEquals(1, insertCnt);
	}
	
	@Test
	public void updateUserTest() throws ParseException {
		/***Given***/
		User user = new User();
		
	
		user.setUserId("xuserid1");
		user.setUserNm("xuserid1테스트");
		user.setPass("xuserid11234");
		user.setReg_dt(new SimpleDateFormat("yyyy-MM-dd").parse("2019-08-08"));
		user.setAlias("엑스유저테스트");
		user.setAddr1("대전광역시 중구 중앙로 76");
		user.setAddr2("영민빌딩 2층 DDIT");
		user.setZipcode("34940");
		
		
		/***When***/
		int updateCnt = userDao.updateUser(sqlSession, user);
		//sqlSession.commit();
		
		/***Then***/
		assertEquals(1, updateCnt);
	}
}
