import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> q = new PriorityQueue<>((o1,o2) ->{
			int one = Math.abs(o1);
			int two = Math.abs(o2);
			if(one == two) {
				return o1 > o2 ? 1: -1; // 절댓값이 같은 경우 음수 우선
			}
			return one - two; // 절댓값 작은 데이터 우선
		});
		
		for(int i=0; i<N; i++) {
			int M = Integer.parseInt(br.readLine());
			if(M == 0) {
				if(q.isEmpty()) {
					System.out.println("0");
				}else System.out.println(q.poll());
			}else {
				q.add(M);
			}
		}
	}

}
