package org.java.DBMemberDao;

import java.util.ArrayList;

//import org.java.DBConnect.DBconnect;
import org.java.DBMemberDto.DBMemberDto;

public class DBMemberDao {

	// sigleton ����
//	private static final DBMemberDao INSTANCE = new DBMemberDao();
//
//	private DBMemberDao() {
//	};
//
//	public static DBMemberDao getInstance() {
//		return INSTANCE;
//	}
	
	public DBMemberDao() {
		System.out.println("DAO������");
	}
	
	// CRUD, DB Access Object
	
	public int insertDo () {
		int result = 0;
		//ȸ������ ����
		return result;
	}
	public ArrayList<DBMemberDto> list () {
		ArrayList<DBMemberDto> lists = new ArrayList<DBMemberDto>();
		
		return lists;
	}
	public int updateDo () {
		int result = 0;
		//ȸ������ ����
		return result;
	}
	public int deleteDo () {
		int result = 0;
		//ȸ������ ����
		return result;
	}
	
	
}
