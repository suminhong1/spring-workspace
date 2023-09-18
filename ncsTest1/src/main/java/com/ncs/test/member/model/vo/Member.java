package com.ncs.test.member.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	
	private String memberId;

	private String memberPwd;

	private String memberName;

	private Date memberEnrollDate;

}
