package notbook;

import java.util.Scanner;

public class MainFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook note = new NoteBook();
		Login lg = new Login();
		boolean t = false;
		Scanner in = new Scanner(System.in);
		System.out.println("*****Please name the filename*****");
		String filename = in.next();
		System.out.println("*****Now you can edit " + filename + "*****");
		while (true) {
			System.out.print("username: ");
			String usr = in.next();
			System.out.print("password: ");
			String pw = in.next();
			if (lg.login(usr, pw)) {
				System.out.println("*****Login Success!*****");
				while (true) {
					System.out.println("\n*****Please input the operation number*****");
					System.out.println("\t1.Add a message\n"
							+ "\t2.Precision addion\n"
							+ "\t3.Remove message\n"
							+ "\t4.View all messages\n"
							+ "\t5.Exit");
					int key = in.nextInt();
					switch (key) {
						case 1:
							System.out.print("Please input the message: ");
							String msg1 = in.next();
							note.add(msg1);
							break;
							
						case 2:
							System.out.print("Please input the message: ");
							String msg2 = in.next();
							System.out.print("Please input the location: ");
							int loc = in.nextInt();
							loc = loc -1;
							note.addplus(loc, msg2);
							break;
							
						case 3:
							System.out.println("Please input the location: ");
							int loc1 = in.nextInt();
							loc1 = loc1 - 1;
							note.remove(loc1);
							break;
							
						case 4:
							note.printlist(note.list());
							break;
							
						case 5:
							t = true;
							break;
							
						default:
							System.out.println("Please confirm and re-enter the number.");
							break;
							
					}
					
					if (t) break;
				}
				
				if (t) break;
			}
			
			else if (t) break;
			
			else {
				System.out.println("Sorry you are a non-manager,\n"
						+ "so you don't have permission to use this app.");
			}
		}
		System.out.println("Thank you for use this app!");
		
	}

}
