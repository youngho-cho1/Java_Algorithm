import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		ArrayList<ArrayList<Integer>> Arr = new ArrayList<>();
		for(int i=0; i<=N; i++) {
			Arr.add(new ArrayList<>()); 
		}
		int indegree[] = new int[N+1];
		for(int i=0; i<M; i++) {
			int S = sc.nextInt();
			int E = sc.nextInt();
			Arr.get(S).add(E);
			indegree[E]++;     
		}

		Queue<Integer> q = new LinkedList<>();
		for(int i=1; i<=N; i++) {

			if(indegree[i] == 0) {
				q.offer(i);
			}
		}
		while(!q.isEmpty()) {
			int now = q.poll();
			System.out.print(now+" ");
			for(int next : Arr.get(now)) {
				indegree[next]--;
				if(indegree[next] == 0) q.offer(next);
			}
		}
		
	}

}
