package com.vastproservlet;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyCheckNumber extends TagSupport {
	String number;

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public int doEndTag() throws JspException {
		JspWriter out = pageContext.getOut();
		int n = Integer.parseInt(number);
		if (n % 2 == 0) {
			try {
				out.println("Even Number...");
			} catch (Exception e) {
			}
		} else {
			try {
				out.println("Odd Number...");
			} catch (Exception e) {
			}
		}
		return super.doEndTag();
	}
}
