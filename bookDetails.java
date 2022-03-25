import java.util.*;

class Book {
	String name;
	String author;
	int price;
	int num_pages;

	Book() {}
	Book(String name, String author, int price, int num_pages) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.num_pages = num_pages;
	}

	void accept() {
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter name of the book:");
		name = s.next();
		System.out.println("Enter author of the book:");
		author = s.next();
		System.out.println("Enter price of the book:");
		price = s.nextInt();
		System.out.println("Enter number of pages in the book:");
		num_pages = s.nextInt();
	}
	
	public String toString() {
		return ("Name: " + name + "\n" + "Author: " + author + "\nPrice: " + price + "\nNumber of Pages: " + num_pages);
	}
}

class bookDetails {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Book b1 = new Book("Heights", "Anne", 299, 345);
		System.out.println("Constructor values: " + b1);
		System.out.println("Enter the number of books: ");
		int n = sc.nextInt();
		Book b[] = new Book[n];
		for(int i = 0; i < n; i++) {
			b[i] = new Book();
			System.out.println("Enter the details of " + (i+1) + " book:");
			b[i].accept();
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Details of book " + (i+1));
			System.out.println(b[i]);
		}
	}
}
