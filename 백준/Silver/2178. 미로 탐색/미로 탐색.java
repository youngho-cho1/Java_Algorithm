import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	// 상하좌우 탐색용 배열
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	static boolean[][] visited;
	static int[][] A;
	static int N, M;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = new int[N][M];
		visited = new boolean[N][M];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for(int j=0; j<M; j++) {
				A[i][j] = Integer.parseInt(line.substring(j, j+1));
			}
		}
		BFS(0,0);
		System.out.println(A[N-1][M-1]);
	}
	private static void BFS(int i, int j) {
		// TODO Auto-generated method stub
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {i,j}); // 큐에 시작점 0,0 넣기, 들어오는 데이터 넣기
		int[] n = q.peek();
		while(!q.isEmpty()) {
			int now[] = q.poll();
			visited[i][j] = true; 
			// 상하좌우 탐색
			for(int k=0; k<4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				// 배열 범위 유효성 조건문
				if(x >= 0 && y >= 0 && x < N && y < M) {
					// 방문한 적이 없고 0이 아닐때
					if(A[x][y] != 0 && !visited[x][y]) {
						visited[x][y] = true;
						A[x][y] = A[now[0]][now[1]] + 1; // 방문 할수 있는 곳에 depth 1 증가
						q.add(new int[] {x,y});
					}
				}
			}
		}
	}

}
