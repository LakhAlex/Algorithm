import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Stack<Integer> stack = new Stack<>(); // 탑의 높이를 저장할 스택
		long ans = 0; // 각 관리인들이 벤치마킹이 가능한 빌딩의 수의 합을 저장할 변수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 입력할 빌딩의 수
		
		for(int i=0; i<N; i++) { // 빌딩의 수 만큼 반복문 진행
			
			int height = Integer.parseInt(br.readLine());
			
			while(!stack.isEmpty()) { // stack이 비어있지 않다면!
				if(stack.peek() <= height) { // 현재 stack에 있는 값과 새로 입력 받은 빌딩의 크기를 비교해서!
					stack.pop(); // 새로 입력 받은 빌딩의 크기가 더 크다면!
								 // 기존 stack의 값을 pop해서 삭제한다!
				}
				else break; // 아니라면, while문을 빠져나간다.
			}
			ans += stack.size(); // 스택 사이즈를 더함으로써, 벤치마킹 가능한 개수를 더해준다.
			stack.push(height); // 빌딩 높이를 stack에 저장한다.
		}
		System.out.println(ans);
	}
}