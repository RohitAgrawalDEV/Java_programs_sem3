// Demonstration of Exceptions



class Exc1 {

    public static void main(String args[]) {	
	int d, a, c[] = new int[5];

	try {

		d = 0;

		System.out.println(c[10]);

		a = 32/d;

		System.out.println("This is not printed");

		

	}

	catch(ArithmeticException e) {

		System.out.println("Division by zero:");

		System.out.println(e);

	}

	catch(ArrayIndexOutOfBoundsException e) {

		System.out.println("Array ndex out of bounds:");

		System.out.println(e);

	}

	System.out.println("After try and catch statements");

    }

}
