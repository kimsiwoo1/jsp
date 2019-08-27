package kr.or.ddit.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FileuploadUtilTest {

	/**
	* Method : getFilenameTest
	* 작성자 : PC-07
	* 변경이력 :
	* Method 설명 :Content-disposition 해더 문자열로 부터 파일 이름 추출 테스트
	*/
	@Test
	public void getFilenameTest() {
		/***Given***/
		String contentDisposition = "form-data; name=\"file\"; filename=\"brown.png\"";
		String contentDisposition2 = "form-data; name=\"file\"; filename=\"moon.png\"";
		
		/***When***/
		String filename = FileuploadUtil.getFilename(contentDisposition);
		String filename2 = FileuploadUtil.getFilename(contentDisposition);
		
		/***Then***/
		assertEquals("brown.png", filename);
		assertEquals("brown.png", filename2);

	}
	
	/**
	* Method : getFileExtensionTest
	* 작성자 : PC-07
	* 변경이력 :
	* Method 설명 :Content-disposition 해더 문자열로 부터 파일 확장자 추출 테스트
	*/
	@Test
	public void getFileExtensionTest() {
		/***Given***/
		String contentDisposition = "form-data; name=\"file\"; filename=\"brown.png\"";
		String contentDisposition2 = "form-data; name=\"file\"; filename=\"moon.png\"";
		String contentDisposition3 = "form-data; name=\"file\"; filename=\"moon\"";
		
		/***When***/
		String fileExtensionName = FileuploadUtil.getFileExtension(contentDisposition);
		String fileExtensionName2 = FileuploadUtil.getFileExtension(contentDisposition2);
		String fileExtensionName3 = FileuploadUtil.getFileExtension(contentDisposition3);
		
		/***Then***/
		assertEquals(".png", fileExtensionName);
		assertEquals(".png", fileExtensionName2);
		assertEquals("", fileExtensionName3);

	}
	
	/**
	* Method : getPathTast
	* 작성자 : PC-07
	* 변경이력 :
	* Method 설명 : 파일 업로드 경로 조회하기 테스트
	*/
	@Test
	public void getPathTast() {
		/***Given***/
		
		/***When***/
		String path = FileuploadUtil.getPath();
		
		/***Then***/
		assertEquals("e:\\upload\\2019\\08\\", path);
	}

}
