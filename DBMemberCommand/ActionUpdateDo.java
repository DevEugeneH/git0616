package org.java.DBMemberCommand;

import org.java.DBMemberDao.DBMemberDao;

public class ActionUpdateDo implements ActionCommand{
	@Override
	public void executeQuery() {
		System.out.println("회원정보 수정");
		
		DBMemberDao dao = new DBMemberDao();
		int result = dao.updateDo();
		
		System.out.println("회원정보 수정 결과 :" + result );
	}
}
