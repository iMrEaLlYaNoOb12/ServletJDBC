package com.amazon.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.amazon.jdbc.conutil.ConnectionUtility1;
import com.amazon.model.Customer;

public class AmazonDTO {
	public static void main(String[] args) throws Exception {
		try {
			Connection con = ConnectionUtility1.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from customer");
			ResultSet rs = ps.executeQuery();
			List<Customer> customers = new ArrayList<>();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

//		while (rs.next()) {
//			Customer customer = new Customer();
//			customer.setUserName(rs.getString(1));
//			customer.setPassword(rs.getString(2));
//			customer.setName(rs.getString(3));
//			customer.setDob(rs.getDate(4));
//			customer.setGender(rs.getString(5));
//			customer.setPhoneNumber(rs.getInt(6));
//			customer.setEmailId(rs.getString(7));
//			customer.setFlag(rs.getInt(8));
//			customers.add(customer);
//
//		}
//		for (Customer customer : customers) {
//			System.out.println(customer);
//		}
// }
