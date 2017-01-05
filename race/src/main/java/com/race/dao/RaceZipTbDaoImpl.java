package com.race.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.race.dto.RaceZipTbVo;

public class RaceZipTbDaoImpl implements RaceDao<RaceZipTbVo, String>{

	private SqlMapClient client;
	public void setClient(SqlMapClient client){
		this.client = client;
	}
	static int view_rows = 5; 	// 페이지의 개수
	static int counts = 10; 		// 한 페이지에 나타낼 상품의 개수
	
	
	@Override
	public List<RaceZipTbVo> selectAll() throws SQLException {
		ArrayList<RaceZipTbVo> list = (ArrayList<RaceZipTbVo>)client.queryForList("selectAllZipTb");
		return list;
	}
	public List<RaceZipTbVo> selectNameAll(String key) throws SQLException {
		ArrayList<RaceZipTbVo> list = (ArrayList<RaceZipTbVo>)client.queryForList("selectNameZipTb",key);
		return list;
	}

	@Override
	public RaceZipTbVo selectVo(String key) throws SQLException {
		return null;
	}

	@Override
	public void insert(RaceZipTbVo vo) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(RaceZipTbVo vo) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String key) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
