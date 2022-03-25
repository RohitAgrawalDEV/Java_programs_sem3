class Exc2 {

	public static void main(String args[]) {

		try {

			int a = 0;

			int b = 42/a;

			int c[] = {100};

			c[20] = 200;

		}

		catch(Exception e) {

			System.out.println("Generic Exception");

		}



		//ArithmeticException is subclass of Exception, so the below catch block is not executed

		Error is generated if below catch block is uncommented

		/*

		catch(ArithmeticException e) {  

			System.out.println("Div by zero: " + e);

		}

		*/

	} 

}
