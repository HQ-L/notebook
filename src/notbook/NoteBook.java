package notbook;

import java.util.ArrayList;

public class NoteBook {
	
	private ArrayList<String> notes = new ArrayList<String>();
	
	public void add(String s) {
		notes.add(s);
	}
	
	public void addplus(int loc, String s) {
		try {
			notes.add(loc, s);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Please pay attation to the size is " + notes.size() + ".");
		}
		
	}
	
	public int getsize() {
		return notes.size();
	}
	
	public String getnote(int index) {
		return notes.get(index);
	}
	
	public boolean remove(int index) {
		boolean flag = true;
		try {
			notes.remove(index);
			System.out.println("Delete Successful!");
		}
		catch (Exception e) {
			flag = false;
			System.out.println("Delete Failure!");
		}
		
		return flag;
	}
	
	public String[] list() {
		String[] a = new String[notes.size()];
//		for (int i = 0; i < notes.size(); i++) {
//			a[i] = notes.get(i);
//		}
//		Same
		notes.toArray(a);
		return a;
	}
	
	public void printlist(String[] a) {
		for (String s : a) {
			System.out.println(s);
		}
	}
	// This main is for test this class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook note1 = new NoteBook();
		note1.add("hello");
		note1.add("world");
		note1.add("Hello");
		note1.add("Java");
		note1.addplus(1, "Huqi");
		System.out.println(note1.getnote(1));
		System.out.println();
//		System.out.println(note1.list());
		note1.printlist(note1.list());
		System.out.println();
		note1.remove(2);
//		System.out.println(note1.list());
		note1.printlist(note1.list());
		System.out.println();
		note1.remove(10);
//		System.out.println(note1.list());
		note1.printlist(note1.list());
		System.out.println();
		note1.remove(1);
		note1.printlist(note1.list());
		System.out.println();

	}

}
