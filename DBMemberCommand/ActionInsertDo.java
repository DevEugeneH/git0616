package org.java.DBMemberCommand;

import org.java.DBMemberDao.DBMemberDao;

public class ActionInsertDo implements ActionCommand{

	@Override
	public void executeQuery() {
		System.out.println("ȸ������");
		
		DBMemberDao dao = new DBMemberDao();
		int result = dao.insertDo();
		System.out.println("ȸ�� ���� ��� : " + result);
	}
	
}
