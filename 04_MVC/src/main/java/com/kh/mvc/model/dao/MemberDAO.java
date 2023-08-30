package com.kh.mvc.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.mvc.model.vo.Member;

@Repository
public class MemberDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public int registerMember(Member vo) {
		return sqlSession.insert("memberMapper.registerMember", vo);
	}
	
	public List<Member> showAllMember() {
		return sqlSession.selectList("memberMapper.showAllMember");
	}
	
	public List<Member> findMember(String keyword) {
		return sqlSession.selectList("memberMapper.findMember", keyword);
	}
	
	public Member login(Member vo) {
		return sqlSession.selectOne("memberMapper.login", vo);
	}
	
	public int updateMember(Member vo) {
		return sqlSession.insert("memberMapper.updateMember", vo);
	}
	
	/*
	 * showAllMember
	 * findMember -> 파라미터 : String keyword, return : List<Member>
	 * login -> 파리미터 : Member vo
	 * updateMember -> 파라미터 : Member vo
	 */
	
}
