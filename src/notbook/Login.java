package notbook;

import java.util.Scanner;

public class Login {
	
	public boolean login(String usr, String pw) {
		boolean flag = false;
		if (usr.equals("admin") && pw.equals("admin")) {
			flag = true;
		}
		
		return flag;
	}
	
//	This main is for test this class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login lg = new Login();
		Scanner in = new Scanner(System.in);
		while (true) {
		String username = in.next();
		String password = in.next();
		boolean rst = lg.login(username, password);
			if (rst) {
				System.out.println("Y");
			}
			else {
				System.out.println("N");
			}
		}

	}

}
