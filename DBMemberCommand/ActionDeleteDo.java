package org.java.DBMemberCommand;

import org.java.DBMemberDao.DBMemberDao;

public class ActionDeleteDo implements ActionCommand{
 @Override
public void executeQuery() {
	 System.out.println("È¸¿ø Å»Åð");
	 
	 DBMemberDao dao = new DBMemberDao();
	 int result = dao.deleteDo();
	 
	 System.out.println("È¸¿ø Å»Åð : " + result);
}
}
