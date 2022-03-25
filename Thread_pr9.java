class NewThread1 implements Runnable {
	String word;
	Thread t;	
	int time;
	NewThread1(String text, int time) {
		word = text;
		t = new Thread(this, word);
		this.time = time;
		t.start();
	}
	
	public void run() {
		try {
			while(true) {
				System.out.println(word);
				Thread.sleep(time);
			}
		}
		catch(InterruptedException e) {
			System.out.println(word + " Interrupted");
		}
		System.out.println(word + " exited");
	}
}

class Thread_pr9 {
	public static void main(String args[]) {
		new NewThread1("BMS College of Engineering", 10000);
		new NewThread1("CSE", 2000);
	}
}
