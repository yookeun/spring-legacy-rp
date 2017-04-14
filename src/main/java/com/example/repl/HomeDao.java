package com.example.repl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class HomeDao {
	@Autowired
	private SqlSession sqlSession;
	
	@Transactional(readOnly=true)
	public List<TestTb> selectList() {
		return sqlSession.selectList("testMapper.selectList");
	}
}
