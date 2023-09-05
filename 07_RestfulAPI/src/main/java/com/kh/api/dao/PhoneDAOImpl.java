package com.kh.api.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.kh.api.model.Phone;
import com.kh.api.model.UserInfo;

public class PhoneDAOImpl implements PhoneDAO{
	
	@Autowired
	private SqlSessionTemplate session;

	@Override
	public int insert(Phone phone) {
		return session.insert("phone.insert", phone);
	}

	@Override
	public int delete(String num) {
		return session.delete("phone.delete",num);
	}

	@Override
	public Phone select(String num) {
		return session.selectOne("phone.select", num);
	}

	@Override
	public List<Phone> select() {
		return session.selectList("phone.select");
	}

	@Override
	public UserInfo select(UserInfo user) {
		return session.selectOne("phone.select", user);
	}

	@Override
	public int update(Phone phone) {
		return session.update("phone.update", phone);
	}

}