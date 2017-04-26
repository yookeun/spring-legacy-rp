package com.example.repl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HomeDao {
	@Autowired
	private SqlSession sqlSession;		
	
	public List<TestTb> selectList() {
		return sqlSession.selectList("testMapper.selectList");
	}
	
	public int inserTestTb(TestTb testTb) {
		return sqlSession.insert("testMapper.insertTestTb", testTb);
	}	

	public TestTb selectOneId(int id) {
		return sqlSession.selectOne("testMapper.selectOneId", id);
	}
	
	public int deleteAll() {
		return sqlSession.delete("testMapper.deleteAll");
	}
	
}
