package org.java.DBMemberCommand;

import org.java.DBMemberDao.DBMemberDao;

public class ActionUpdateDo implements ActionCommand{
	@Override
	public void executeQuery() {
		System.out.println("ȸ������ ����");
		
		DBMemberDao dao = new DBMemberDao();
		int result = dao.updateDo();
		
		System.out.println("ȸ������ ���� ��� :" + result );
	}
}
