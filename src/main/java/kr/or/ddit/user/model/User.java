package kr.or.ddit.user.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.media.jfxmedia.logging.Logger;

public class User {
	private String userId;			//사용자 아이디
	private String pass;			//사용자 비밀번호
	private String userNm;		//사용자 이름
	private String alias;	//별명
	private Date reg_dt;	//등록일
	private String reg_dt_fmt = "2019-09-20";
	private String addr1;
	private String addr2;
	private String zipcode;
	

	public User() {
	
	}
	
	public User(String userName) {
		this.userNm = userName;
	}

	public User(String userId, String userNm, String alias, Date reg_dt, String addr1, String addr2,
			String zipcode, String pass) {
		this.userId = userId;
		this.userNm = userNm;
		this.alias = alias;
		this.reg_dt = reg_dt;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.zipcode = zipcode;
		this.pass = pass;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getUserNm() {
		return userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Date getReg_dt() {
		return reg_dt;
	}
	
	public String getReg_dt_fmt() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(reg_dt);
	}
	public void setReg_dt(Date reg_dt) {
		this.reg_dt = reg_dt;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public void setReg_dt_fmt(String reg_dt_fmt) {
		this.reg_dt_fmt = reg_dt_fmt;
	}

	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", pass=" + pass + ", userNm=" + userNm + ", alias=" + alias + ", reg_dt="
				+ reg_dt + ", reg_dt_fmt=" + reg_dt_fmt + ", addr1=" + addr1 + ", addr2=" + addr2 + ", zipcode="
				+ zipcode + "]";
	}

	public boolean checkLoginValidate(String userId, String pass) {
		
		if(userId.equals(this.userId) && pass.equals(this.pass))
			return true;
		
		return false;
	}
	
}