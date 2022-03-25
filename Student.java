package CIE;



import java.util.*;



public class Student {

	Scanner sc = new Scanner(System.in);
	public String usn;

	public String name;

	public int sem;



	public void accept() {

		System.out.println("Enter USN:");

		usn = sc.nextLine();

		System.out.println("Enter name:");

		name = sc.nextLine();

		System.out.println("Enter semester:");

		sem = sc.nextInt();	

	}

	public void display() {

		System.out.println("USN: " + usn);

		System.out.println("Name: " + name);

		System.out.println("Semester: " + sem);

	}

}
