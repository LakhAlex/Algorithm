import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class StackInfo{
	// StackInfo에서 사용되는 필드(변수)
	int value;
	int index;
	
	// 생성자
	StackInfo(int val, int inx){ // val: stack에 저장되는 값, inx: 저장되는 값의 인덱스
		value = val;
		index = inx;
	}
}

public class Main {
	public static void main(String[] args) throws IOException {
		/*	
			예제 입력
		 	5
		 	6 9 5 7 4
		 	
		 	예제 출력
		 	0 0 2 2 4
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<StackInfo> stack = new Stack<>();
		
		int N = Integer.parseInt(br.readLine()); // 입력 받은 탑의 개수를 N에 저장한다.
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) { // N을 통해서 입력받은 탑의 개수 만큼 반복
			int val = Integer.parseInt(st.nextToken()); // 공백을 기준으로 구분한 문자 하나를 숫자 타입으로 전환해서 저장한다.
			// 두 번째 부터는 자신의 앞에 들어온 값이 자신보다 작은지 여부를 확인한다.
			while(!stack.isEmpty() && val > stack.peek().value) { // 8번 과정
				stack.pop(); // (ex: 7의 경우 5보다 크고 9보다 작기 때문에 pop을 통해서 5를 무시하고 9로 가기 위함.
			}
			if(stack.empty()) { // stack이 비어있을 경우! == 맨 처음 입력된 탑은 자신의 앞에 아무것도 없음!
				System.out.print("0 ");
			}
			else { // stack이 비어있지 않고, 다음에 입력받은 값이 peek를 통해서 확인한 값보다 작을 경우! (ex: 4는 7보다 작음!)
				int index = stack.peek().index; // 가장 마지막에 push한 값을 가져오기
				System.out.print(++index + " ");
				/*	바로 System.out.print(index + " ")를 하면
					0 0 1 1 3 으로 값이 출력된다.
					그러므로 index에 + 1을 해줌으로써 0 0 2 2 4로 만들어준다!
				*/
			}
			stack.push(new StackInfo(val, i));
		}
	}
}
