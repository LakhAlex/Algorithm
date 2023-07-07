import java.util.*;

public class Main {
	
	public static int stack[];
	public static int top = -1;
	
	public static void push(int num) {
		stack[++top] = num;
	}
	
	public static void pop() {
		if (top == -1) return ; // stack이 비어있을 경우 아무런 동작을 수행하지 않도록 진행
		
		stack[top--] = 0; // stack이 비어있찌 않을 경우 값을 빼는 작업 진행
	}
	
	public static int sum() { // 정수를 입력하는 반복문이 끝났을 경우 stack에 남아있는 정수들을 모두 더하는 과정을 진행
		int s = 0;
		for(int i : stack) {
			s+= i;
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // stack의 크기와 정수를 입력 받을 수 있게 하는 Scanner 객체 생성
		
		int N = sc.nextInt(); // 스택의 크기 입력 받기
		stack = new int[N]; // 스택의 크기 설정
		
		// stack에 값을 입력 혹은 빼기 진행하는 for문 생성
		for(int i = 0; i < stack.length; i++) {
			N = sc.nextInt();
			switch(N) {
			case 0: // N의 값이 0일 경우 실행
				pop();
				break;
			default : // N의 값이 0이 아닐 경우 실행
				push(N);
				break;
			}
		}
		
		// stack에 값을 넣거나 빼는 반복문 종료 후 실행
		System.out.println(sum());
	}

}
