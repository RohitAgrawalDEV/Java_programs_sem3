package CIE;



import java.util.*;



public class Internals extends CIE.Student {

	public int ciem[] = new int[5];
	Scanner sc = new Scanner(System.in);

	

	public void accept() {

		for(int i = 0; i < 5; i++) {

			System.out.println("Enter CIE marks of subject " + (i+1));

			ciem[i] = sc.nextInt();

		}

	}

}
