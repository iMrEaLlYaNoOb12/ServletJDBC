package com.vastpro.dao;

import java.util.List;

import com.vastpro.model.Student;

public interface StudentDAO {
	public Student findByID(int sId) throws Exception;

	public Student findBySname(String sName) throws Exception;

	public List<Student> findAll() throws Exception;

	public int createEmployee(Student student);

	public int updateEmployee(Student student);

	public int deleteEmployeeByID(int sId);

	public int deleteEmployeeByName(String sName);
}
