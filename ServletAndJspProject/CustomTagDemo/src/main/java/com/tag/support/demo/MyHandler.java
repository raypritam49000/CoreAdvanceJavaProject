package com.tag.support.demo;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

@SuppressWarnings("unused")
public class MyHandler extends TagSupport {
	private static final long serialVersionUID = 1L;

	private String number1;
	private String number2;

	public void setNumber1(String number1) {
		this.number1 = number1;
	}

	public void setNumber2(String number2) {
		this.number2 = number2;
	}

	@Override
	public int doStartTag() throws JspException {
		int totalSum = Integer.parseInt(number1) + Integer.parseInt(number2);
		try {
			JspWriter out = pageContext.getOut();
			out.println("Total Sum " + totalSum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Tag.EVAL_BODY_INCLUDE;
		// return Tag.SKIP_BODY;
	}

}
