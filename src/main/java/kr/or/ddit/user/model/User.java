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

	public User() {
	
	}
	
	public User(String userName) {
		this.userNm = userName;
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

	@Override
	public String toString() {
		return "UserVo [userId=" + userId + ", pass=" + pass + ", userName=" + userNm + "]";
	}
	
	public boolean checkLoginValidate(String userId, String pass) {
		
		if(userId.equals(this.userId) && pass.equals(this.pass))
			return true;
		
		return false;
	}
	
}