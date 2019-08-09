package kr.or.ddit.util;

public class CookieUtil {
	/**
	 * 
	* Method : getCookie
	* 작성자 : PC-07
	* 변경이력 :
	* @param cookieString
	* @param string
	* @return
	* Method 설명 : 쿠키 문자열로부터 특정 쿠기 값을 반환
	 */
	public static String getCookie(String cookieString, String cookieId) {
		String[] cookies =  cookieString.split("; ");
		
		for(String cookie : cookies) {
			String[] cookieVal = cookie.split("=");
			if(cookieId.equals(cookieVal[0])) {
				return cookieVal[1];
			}
		}
		return null;
	}

}
