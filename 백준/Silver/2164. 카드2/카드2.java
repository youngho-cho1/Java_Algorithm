
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> Q = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i <= N; i++) Q.add(i);
		
		while(Q.size()>1) {
			Q.poll();
			Q.add(Q.poll());
		}
		System.out.println(Q.peek());
	}

}
