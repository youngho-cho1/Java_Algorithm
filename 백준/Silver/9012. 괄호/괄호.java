import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		char arr[];
	
		for(int i=0; i<N; i++) {
			Stack<Integer> stack = new Stack<>();
			arr = br.readLine().toCharArray();
			boolean check = true;
			if(arr.length%2 != 0) sb.append("NO\n");
			else {
				for(int j=0; j<arr.length; j++) {
					if(arr[0] == ')') {
						sb.append("NO\n"); 
						check = false;
						break;
					}
					if(arr[j] == '(') stack.push(0);
					
					if(stack.size() == 0) {
						sb.append("NO\n"); 
						check = false;
						break;
					}
					else if(arr[j] == ')' && stack.peek() == 0) {
						stack.pop();
					}
				}
				if(stack.empty() && check) sb.append("YES\n");
				else if(!stack.empty() && check) sb.append("NO\n");
			}
		}
		System.out.println(sb);
	}

}
