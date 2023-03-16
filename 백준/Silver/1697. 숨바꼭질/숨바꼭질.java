import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int max = 100001;
	static int n;
	static int k;
	static int[] dist;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<>();
		int[] dist = new int [max];
		boolean[] visit = new boolean[max];
		q.offer(n);
		
		while(!q.isEmpty()) {
			int now = q.poll();
			if(now == k) {
				break;
			}
			 // 수빈이가 x+1로 이동했을 경우
            if (now+1 < max && !visit[now+1]) {
                visit[now+1] = true;
                q.add(now+1);
                dist[now+1] = dist[now] + 1;
            }
            // 수빈이가 x-1로 이동했을 경우
            if (now-1 >= 0 && !visit[now-1]) {
                visit[now-1] = true;
                q.add(now-1);
                dist[now-1] = dist[now] + 1;
            }
            // 수빈이가 2*x로 이동했을 경우
            if (now*2 < max && visit[now*2] == false) {
                visit[now*2] = true;
                q.add(now*2);
                dist[now*2] = dist[now] + 1;
            }
		}
		System.out.println(dist[k]);
		
		
	}


}
