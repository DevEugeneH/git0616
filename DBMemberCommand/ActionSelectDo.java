package org.java.DBMemberCommand;

import java.util.ArrayList;

import org.java.DBMemberDao.DBMemberDao;
import org.java.DBMemberDto.DBMemberDto;

public class ActionSelectDo implements ActionCommand{
	@Override
	public void executeQuery() {
		System.out.println("ȸ������ ��ȸ");
		
		DBMemberDao dao = new DBMemberDao();
		
		ArrayList<DBMemberDto> lists = dao.list();
		
		System.out.println("ȸ������ ��ȸ ���" + lists);
		
		
	}
}
