import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<ArrayList<Integer>> Arr = new ArrayList<>();
		
		for(int i=0; i<=N; i++) {
			Arr.add(new ArrayList<>()); // ArrayList의 배열을 초기화
		}
		int indegree[] = new int[N+1];
		int time[] = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			time[i] = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			for(int j=0; j<num; j++) {
				int temp = Integer.parseInt(st.nextToken());
				Arr.get(temp).add(i);
				indegree[i]++;
			}
		}
		Queue<Integer> q = new LinkedList<>();
		int result[] = new int[N+1];
		for(int i=1; i<=N; i++) {
			result[i] = time[i];
			if(indegree[i] == 0) q.offer(i);
		}
		while(!q.isEmpty()) {
			int now = q.poll();
			for(int next: Arr.get(now)) {
				indegree[next]--;
				result[next] = Math.max(result[next], result[now] + time[next]);
				if(indegree[next] == 0) q.offer(next);
			}
		}
		int max = 0;
		for(int i=1; i<=N; i++) {
			max = Math.max(max, result[i]);
		}
		System.out.println(max);
	}

}
