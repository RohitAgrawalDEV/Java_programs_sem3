abstract class Sample {
	abstract void callme();

	void callmetoo() {
		System.out.println("callme in abstract class");
	}
}

class inabst extends Sample {
	void callme() {
		System.out.println("callme method in subclass overidden");
	}
}

class SampleAbstract {
	public static void main(String args[]) {
		inabst o = new inabst();
		o.callme();
		o.callmetoo();
	}
}
