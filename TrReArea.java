class Area {
	int a, b;
	Area(int x, int y) {
		a = x;
		b = y;
	}
	double area() {
		System.out.println("Area is not defined");
		return 0;
	}
}

class Rectangle extends Area {
	Rectangle(int x, int y) {
		super(x, y);
	}
	double area() {
		return a*b;
	}
}

class Triangle extends Area {
	Triangle(int x, int y) {
		super(x, y);
	}
	double area() {
		return (0.5*a*b);
	}
}

class TrReArea {
	public static void main(String args[]) {
		Area a = new Area(4, 6);
		Rectangle r = new Rectangle(4, 6);
		Triangle t = new Triangle(4, 6); 
		Area o;
		o = a;
		System.out.println("Area of area is " + o.area());
		o = r;
		System.out.println("Area of rectangle is " + o.area());
		o = t;
		System.out.println("Area of triangle is " + o.area());
		
	}
}
