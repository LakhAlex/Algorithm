import java.util.*;

public class Main {
	public static int stack[];
	public static int N = 0;
	public static int top = -1;
	public static int size = 0;
	
	public static void push(int num) { // 입력 받은 값을 stack에 저장하는 메소드
		top += 1;
		stack[top] = num;
		size++;
	}
	
	public static int pop() { // stack에 저장되어 있는 값을 출력하는 메소드
		if (top == -1) { // stack에 정수가 없을 경우 -1을 출력한다.
//			System.out.println("-1");
			
			return -1;
		}
//		System.out.println(stack[top]);
		N = stack[top];
		stack[top--] = 0;
		size--;
		return N;
	}
	
	public static int size() {
//		System.out.println(size);
		return size;
	}
	
	public static int empty() { // 현재 stack이 비어있는지에 대한 유무를 출력하는 메소드
		if(top != -1) { // stack이 비어 있지 않을 경우
//			System.out.println("0");
			return 0;
		}
//		System.out.println("1"); // stack이 비어있을 경우
		return 1;
	}
	
	public static int top() { // 현재 stack에서 제일 위에 있는 정수를 출력하는 메소드
		if(top == -1) {
//			System.out.println("-1");
			return -1;
		}
//		System.out.println(stack[top]);
		return stack[top];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		N = sc.nextInt();
		stack = new int [N]; // 스택의 크기 설정
		
		for(int i = 0; i < stack.length; ++i) {
			String str = sc.next(); // pop이나 push 읽을 변수
			
			switch(str) {
			
			case "push":
				push(sc.nextInt());
				break;
			case "pop":
				sb.append(pop()).append("\n");
				break;
			case "size":
				sb.append(size()).append("\n");
				break;
			case "empty":
				sb.append(empty()).append("\n");
				break;
			case "top":
				sb.append(top()).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
}
