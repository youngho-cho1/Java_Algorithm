import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		boolean check = true;
		int arr[] = new int[N];
		int num = 1;
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] >= num) {
				while(arr[i] >= num) {
					stack.push(num);
					num ++;
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			}
			else { // arr[i]가 작은경우
				if(stack.pop() > arr[i]) {
					System.out.println("NO");
					check = false;
					break;
				}else { // stack.pop <= arr[i]
					sb.append("-\n");
				}
			}
		}
		if(check) System.out.println(sb);
	}

}
