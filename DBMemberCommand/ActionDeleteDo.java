package org.java.DBMemberCommand;

import org.java.DBMemberDao.DBMemberDao;

public class ActionDeleteDo implements ActionCommand{
 @Override
public void executeQuery() {
	 System.out.println("ȸ�� Ż��");
	 
	 DBMemberDao dao = new DBMemberDao();
	 int result = dao.deleteDo();
	 
	 System.out.println("ȸ�� Ż�� : " + result);
}
}
