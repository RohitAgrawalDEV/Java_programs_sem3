import java.util.*;

class StackOp {
	int top = -1;
	int size;
	int s[] = new int[100];
	
	StackOp(int size) {
		this.size = size;
	}	

	void push(int item) {
		if(top == size-1) {
			System.out.println("Stack overflow");
			return;
		}
		s[++top] = item; 
	}
	int pop() {
		if(top == -1) {
			return -1;
		}
		int item = s[top--];
		return item; 
	}
	void display() {
		if(top == -1) {
			System.out.println("Stack is empty");
			return;
		}
		for(int i = 0; i <= top; i++) {
			System.out.println(s[i]);
		}
	}
}

class StackOpr {
	public static void main(String args[]) {
		int n, item;
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of the stack:");
		n = sc.nextInt();
		StackOp o = new StackOp(n);
		int choice;
		for(;;)
		{
			System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
			choice = sc.nextInt();
			switch(choice) {
				case 1: System.out.println("Enter item to be inserted");
					item = sc.nextInt();
					o.push(item);
					break;
				case 2: item = o.pop();
					if(item == -1)
						System.out.println("Stack empty");
					else
						System.out.println(item + " removed");
					break;
				case 3: o.display();
					break;
				default: System.exit(0);
			}
		}
	}
}
