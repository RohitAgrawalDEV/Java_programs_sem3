abstract class Areadim {
	double a, b;
	Areadim(double x, double y) {	
		a = x;
		b = y;	
	}
	abstract double area();
}

class Triangle extends Areadim {
	Triangle(double x, double y) {
		super(x, y);
	}
	double area() {
		return (0.5*a*b);
	}
}

class Rectangle extends Areadim {
	Rectangle(double x, double y) {
		super(x, y);
	}
	double area() {
		return (a*b);
	}
}

class RectTriAreaAbst {
	public static void main(String args[]) {
		//Areadim a = new Areadim(2, 3);
		Triangle t = new Triangle(2.0, 3.0);
		Rectangle r = new Rectangle(2.0, 3.0);
		System.out.println("Triangle area: " + t.area());
		System.out.println("Reactangle area: " + r.area());
	}
}
