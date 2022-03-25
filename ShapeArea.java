abstract class Shape {
	int a, b;
	Shape(int x, int y) {
		a = x;
		b = y;
	}
	abstract void printArea();
}

class Rectangle extends Shape {
	Rectangle(int x, int y) {
		super(x, y);
	}
	void printArea() {
		System.out.println("Area of rectangle is " + (a*b));
	}
}

class Triangle extends Shape {
	Triangle(int x, int y) {
		super(x, y);
	}
	void printArea() {
		System.out.println("Area of triangle is " + (0.5*a*b));
	}
}

class Circle extends Shape {
	Circle(int r){
		super(r, 0);
	}
	void printArea() {
		System.out.println("Area of circle is " + (3.14*a*a));
	}
}

class ShapeArea {
	public static void main(String args[]) {
		Rectangle r = new Rectangle(2, 3);
		Triangle t = new Triangle(2, 3);
		Circle c = new Circle(2);
		r.printArea();
		t.printArea();
		c.printArea();
	}
}
