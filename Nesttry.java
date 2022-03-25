class Nesttry {
	public static void main(String args[]) {
		try {
			int a = args.length;
			int b = 42/a;
			System.out.println("a = " + a);
			try {
				if(a == 1) {
					a = a/(a-a);
				}
				if(a == 2) {
					int c[] = {1};
					c[42] = 2;
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Out Of Bounds:\n" + e);
			}
			System.out.println("Sample Statement"); // This statement is executed only if the above catch block is executed 
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero:\n" + e);
		}
		System.out.println("After nested try catch block");
	}
}
