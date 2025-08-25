package com.meetmate.infra.user;

import java.util.Date;

public class UserDto {
	
	private String userSeq;
	private String userName;
	private Integer userBirth;
	private String userGender;
	private String userId;
	private String userPw;
	private String userEmail;
	private Integer userPhone;
	private Integer userZipCode;
	private String userAddress;
	private String userDtAddress;
	private Date userMoDate;
	private Date userReDate;
	private Integer userDelNY;
	// get,set
	public String getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(String userSeq) {
		this.userSeq = userSeq;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(Integer userBirth) {
		this.userBirth = userBirth;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Integer getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(Integer userPhone) {
		this.userPhone = userPhone;
	}
	public Integer getUserZipCode() {
		return userZipCode;
	}
	public void setUserZipCode(Integer userZipCode) {
		this.userZipCode = userZipCode;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserDtAddress() {
		return userDtAddress;
	}
	public void setUserDtAddress(String userDtAddress) {
		this.userDtAddress = userDtAddress;
	}
	public Date getUserMoDate() {
		return userMoDate;
	}
	public void setUserMoDate(Date userMoDate) {
		this.userMoDate = userMoDate;
	}
	public Date getUserReDate() {
		return userReDate;
	}
	public void setUserReDate(Date userReDate) {
		this.userReDate = userReDate;
	}
	public Integer getUserDelNY() {
		return userDelNY;
	}
	public void setUserDelNY(Integer userDelNY) {
		this.userDelNY = userDelNY;
	}
	
}
