import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>(); // Stack 클래스를 사용하여 stack 생성
		StringBuilder sb = new StringBuilder();
		String flag = "";
		
		int size = sc.nextInt(); // 전체 입력 받는 명령어 수를 저장
		int cnt = 1; // 1 ~ n까지의 수를 표현하는데 사용되는 변수
		
		for(int i = 0; i < size; i++) { // size 크기 만큼 반복 진행
			int N = sc.nextInt(); // 4, 3, 6, 8... 같은 수를 입력 받는 N 생성
			for(; N >= cnt; cnt++) { // N과 같은 수가 나오기 전까지 계속해서 값을 stack에 push하는 반복문
				stack.push(cnt);
				sb.append("+" + "\n"); // 값을 push했음을 String에 추가해서 저장한다.
			}
			if(stack.peek() == N) { // stack의 맨 위에 있는 요소가 N과 같을 경우 실행
				stack.pop(); // 해당 요소를 pop해서 제거한다.
				sb.append("-" + "\n"); // pop했음을 String에 추가한다.
			}
			else { // 만약에 제일 위에 있는 요소가 찾고자하는 값 N과 같이 않을 경우, 해당 값이 없다는 것으로 간주하고
				   // 수열을 만들 수 없음을 출력하기 위해서 진행한다.
//				System.out.println("NO"); // 수열을 만들 수 없음을 출력하는 System.out.println();
//				break; // 반복문을 탈출하기 위한 break 설정
				
				// 해당 else에서 바로 NO를 출력하면 4까지 입력 받지 못 함을 확인.
				// flag변수를 생성하여 해당 변수를 사용할 수 없음을 기록하는 것으로 진행
				// 수열을 만들 수 없음을 기록 하는 flag 내부에는 TRUE라는 값을 넣어준다.
				flag = "TRUE";
			}
		}
		
		if(flag.equals("TRUE")) { // flag가 TRUE와 일치하면 수열을 만들 수 없으므로 NO를 출력한다. 
			System.out.println("NO");
		}
		else { // flag가 TRUE가 아니고, 수열을 만들 수 있는 상태이면 +(push), -(pop)한 결과 출력하기
			System.out.println(sb);
		}
	}
}
