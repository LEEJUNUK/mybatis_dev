package kr.or.dgit.mybatis_dev.dto;

import java.util.Date;

public class Student {
private int studId;
private String name;
private String email;
private PhoneNumber phone;
private Date dob;


@Override
public String toString() {
	return "Student [studId=" + studId + ", name=" + name + ", email=" + email + ", phone=" + phone + ", dob=" + dob
			+ "]";
}

}
