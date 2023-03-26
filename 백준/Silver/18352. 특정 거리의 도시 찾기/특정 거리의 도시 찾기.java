import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int visited[];
	static ArrayList<ArrayList<Integer>> A = new ArrayList<>();
	static int n, k, x, m; // 도시 개수, 도로 개수, 거리 정보, 시작 도시
	static int cnt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		x = sc.nextInt();
		visited = new int[n+1];
		//그래프, 방문 배열 초기화
		for(int i=0; i<=n; i++) {
			A.add(new ArrayList<>());
			visited[i] = -1;
		}
		//도시 정보 단방향으로 입력 받기
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			A.get(a).add(b);
		}
		BFS(x);
		boolean check = false;
		// 방문 배열의 인덱스는 도시별 거리가 저장되기 때문에 K만큼의 거리인 인덱스를 찾으면 됨.
		for(int i=1; i<=n; i++) {
			if(visited[i] == k) {
				System.out.println(i);
				check = true;
			}
		}
		if(!check) System.out.println("-1");
	}
	private static void BFS(int index) {
		// 시작도시에서 시작도시의 거리는 0이다.
		visited[index] = 0;
		Queue<Integer> q = new LinkedList<>();
		q.offer(index);
		
		while(!q.isEmpty()) {
			// 현재 도시와 인접한 도시들에 대해서 방문한적이 없는 경우 방문, 현재 도시 +1 거리 업데이트
			int now = q.poll();
			for(int next : A.get(now)) {
				if(visited[next] == -1) {
					visited[next] = visited[now] + 1;
					q.offer(next);
				}
			}
		}
	}

}
