import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	static ArrayList<Integer>[] A;
	static int check[];
	static boolean visited[];
	static boolean isEven;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for (int t = 0; t < testCase; t++) {
			String[] s = br.readLine().split(" ");
			int v = Integer.parseInt(s[0]);
			int e = Integer.parseInt(s[1]);
			A = new ArrayList[v + 1];
			visited = new boolean[v + 1];
			check = new int[v + 1];
			isEven = true;
			// ArrayList에 각 배열에 공간마다 ArrayList로 초기화
			for (int i = 1; i <= v; i++) {
				A[i] = new ArrayList<Integer>();
			}
			// 에지 데이터 저장하기
			for (int i = 0; i < e; i++) {
				s = br.readLine().split(" ");
				int start = Integer.parseInt(s[0]);
				int end = Integer.parseInt(s[1]);
				A[start].add(end);
				A[end].add(start);
				// 양방향이기 대문에
			}

			// 모든 노드에서 DFS 실행
			for (int i = 1; i <= v; i++) {
				if (isEven) {
					DFS(i);
				} else
					break;
			}
			if (isEven)
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}

	private static void DFS(int node) {
		// TODO Auto-generated method stub
		visited[node] = true;
		// 현재 start에서 연결되어 있는 모든 노드를 탐색
		for (int i : A[node]) {
			if (!visited[i]) {
				// 바로 직전에 있는 노드와 다른 집합으로 분류를 해주는것이 필요함
				check[i] = (check[node] + 1) % 2;
				// check[start]가 0이면 check[i]가 1, 1이면 0
				DFS(i);
			} else if (check[node] == check[i]) {
				// 체크했던 start와 방문할 노드가 똑같으면 이분 그래프가 X
				isEven = false;
			}
		}
	}
}
