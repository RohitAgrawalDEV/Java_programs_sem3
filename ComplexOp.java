class Complex {

	int real, imaginary;
	

	Complex(int real, int imaginary) {

		this.real = real;

		this.imaginary = imaginary;

	}

	

	Complex add(Complex o) {

		Complex ob = new Complex(o.real+real, o.imaginary+imaginary);

		return ob;

	}



	Complex sub(Complex o) {

		Complex ob = new Complex(real - o.real, imaginary - o.imaginary);

		return ob;

	}

}



class ComplexOp {

	public static void main(String args[]) {

		Complex o1 = new Complex(1, 2);

		Complex o2 = new Complex(3, 4);

		Complex sum = o1.add(o2);

		Complex dif = o1.sub(o2);

		System.out.println("Complex numbers:");

		System.out.println(o1.real + " + i" +o1.imaginary);

		System.out.println(o2.real + " + i" +o2.imaginary);	

		System.out.println("\nSum: " + sum.real + " + " + sum.imaginary + "i");

		System.out.println("\nDifference: " + dif.real + " + " + dif.imaginary + "i");

	}

}
