package com.vastpro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.vastpro.jdbc.conutil.ConnectionUtility1;
//import com.vastpro.jdbc.main.ConnectionUtility;
import com.vastpro.model.Student;

public class StudentDAOImpl implements StudentDAO {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public StudentDAOImpl(Connection con) {
		this.con = con;
	}

	@Override
	public Student findByID(int sId) throws Exception {
		ps = con.prepareStatement("select * from student where sid = ?");
		ps.setInt(1, sId);
		rs = ps.executeQuery();
		Student student = new Student();
		if (rs.next()) {
			student.setSid(rs.getInt(1));
			student.setSname(rs.getString(2));
			student.setPercentage(rs.getInt("percentage"));
			student.setFlag(rs.getInt("flag"));

		} else {
			System.out.println("There are no records with this ID.");
		}
		ps.close();
		rs.close();
		ConnectionUtility1.closeConnection(null, null);
		return student;
	}

	@Override
	public Student findBySname(String sName) throws Exception {
		ps = con.prepareStatement("select * from student where sname=?");
		ps.setString(1, sName);
		rs = ps.executeQuery();
		Student student = new Student();
		if (rs.next()) {
			student.setSid(rs.getInt(1));
			student.setSname(rs.getString(2));
			student.setPercentage(rs.getInt("percentage"));
			student.setFlag(rs.getInt("flag"));
		} else {
			System.out.println("No Record found.....");
		}
		ps.close();
		rs.close();
		ConnectionUtility1.closeConnection(null, null);
		return student;
	}

	@Override
	public List<Student> findAll() throws Exception {
		ps = con.prepareStatement("select * from student");
		rs = ps.executeQuery();
		ArrayList<Student> list = new ArrayList<Student>();
		while (rs.next()) {
			Student student = new Student();
			student.setSid(rs.getInt(1));
			student.setSname(rs.getString(2));
			student.setPercentage(rs.getInt("percentage"));
			student.setFlag(rs.getInt("flag"));
			list.add(student);
		}
		ps.close();
		rs.close();
		ConnectionUtility1.closeConnection(null, null);
		return list;
	}

	@Override
	public int createEmployee(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEmployee(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmployeeByID(int sId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmployeeByName(String sName) {
		// TODO Auto-generated method stub
		return 0;
	}

}
//CREATE TABLE CUSTOMER(
//		UserName varchar(20) PRIMARY KEY,
//		Password varchar(10) NOT NULL,
//		Name varchar(50) NOT NULL,
//		DOB DATE NOT NULL,
//		Gender CHAR(1) NOT NULL, 
//		PhoneNumber LONG NOT NULL CHECK (PhoneNumber=10),
//		EmailID varchar(30) UNIQUE NOT NULL,
//		Flag int NOT NULL
//		);
