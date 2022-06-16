package org.java.DBMemberController;

import java.util.Scanner;

import org.java.DBMemberCommand.ActionCommand;
import org.java.DBMemberCommand.ActionDeleteDo;
import org.java.DBMemberCommand.ActionInsertDo;
import org.java.DBMemberCommand.ActionSelectDo;
import org.java.DBMemberCommand.ActionUpdateDo;




public class DBMemberController{
	public static void main(String[] args) {
		
		ActionCommand command = null;
		
		
		Scanner scn = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("Insert Query (insert, select, update, delete");
		String in = scn.next();
		
			if(in.equals("insert")) {
				command = new ActionInsertDo();
				command.executeQuery();
			} else if (in.equals("select")) {
				command = new ActionSelectDo();
				command.executeQuery();
			} else if (in.equals("update")) {
				command = new ActionUpdateDo();
				command.executeQuery();
			} else if (in.equals("delete")) {
				command = new ActionDeleteDo();
				command.executeQuery();
			} else if (in.equals("exit")) {
				System.out.println("Program exit");
				break;
			} else {
				System.out.println("Disable Query");
			}
		}
		scn.close();
	}

}
