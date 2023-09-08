package com.vastpro.dto.main;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.vastpro.jdbc.conutil.ConnectionUtility1;
import com.vastpro.model.Student;

//DTO - Data Transfer Object, if not implements Serializable, it is a VO - Value object
public class DTODemo implements Serializable {
	public static void main(String[] args) throws Exception {
		Connection con = ConnectionUtility1.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from student");
		ResultSet rs = ps.executeQuery();
		List<Student> students = new ArrayList<>();
		while (rs.next()) {
			Student student = new Student();
			student.setSid(rs.getInt(1));
			student.setSname(rs.getString(2));
			student.setPercentage(rs.getInt(3));
			student.setFlag(rs.getInt(4));
			students.add(student);
		}
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
