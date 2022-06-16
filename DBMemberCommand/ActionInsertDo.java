package org.java.DBMemberCommand;

import org.java.DBMemberDao.DBMemberDao;

public class ActionInsertDo implements ActionCommand{

	@Override
	public void executeQuery() {
		System.out.println("회원가입");
		
		DBMemberDao dao = new DBMemberDao();
		int result = dao.insertDo();
		System.out.println("회원 가입 결과 : " + result);
	}
	
}
