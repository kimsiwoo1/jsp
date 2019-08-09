package kr.or.ddit.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CookieUtilTest {

	@Test
	public void test() {
		/***Given***/
		String cookieString = "rememberMe=Y; userId=brown; test=testValue";
		/***When***/
		String cookieValue = CookieUtil.getCookie(cookieString, "rememberMe");
		String cookieValue2 = CookieUtil.getCookie(cookieString, "userId");
		String cookieValue3 = CookieUtil.getCookie(cookieString, "test");
		/***Then***/
		assertEquals("Y", cookieValue);
		assertEquals("brown", cookieValue2);
		assertEquals("testValue", cookieValue3);
	}

}
