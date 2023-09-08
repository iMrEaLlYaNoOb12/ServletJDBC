package com.amazon.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Objects;

import com.amazon.jdbc.conutil.ConnectionUtility1;

public class Customer {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	private String userName;
	private String password;
	private String name;
	private Date dob;
	private String gender;
	private long phoneNumber;
	private String emailId;
	private int flag;

	public Customer(String userName, String password, String name, Date dob, String gender, long phoneNumber,
			String emailId, int flag) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.flag = flag;
	}

	public Customer() throws Exception {
		super();
		con = ConnectionUtility1.getConnection();
		ps = con.prepareStatement("select * from customer");
		rs = ps.executeQuery();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(userName, other.userName);
	}

	@Override
	public String toString() {
		return "Customer [userName=" + userName + ", password=" + password + ", name=" + name + ", dob=" + dob
				+ ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", emailId=" + emailId + ", flag=" + flag
				+ "]";
	}

}
