package com.gura.spring02.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring02.member.dto.MemberDto;

//spring이 생성해서 관리하는 bean이 될 수 있도록 적절한 어노테이션을 붙여준다.

@Repository
public class MemberDaoImpl implements MemberDao{

	//필요한 핵심의존객체를 필드로 선언하고 @Autowired 어노테이션을 붙여준다.
	
	@Autowired
	private SqlSession session;
	
	@Override
	public List<MemberDto> getList() {

		return null;
	}

	@Override
	public void insert(MemberDto dto) {

		
	}

}
