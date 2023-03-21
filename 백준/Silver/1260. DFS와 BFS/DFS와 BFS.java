import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;
	static boolean[]visited;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1][n+1];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		visited = new boolean[n+1];
		DFS(v);
		System.out.println();
		visited = new boolean[n+1];
		BFS(v);
			
	}

	private static void DFS(int v) {
		// TODO Auto-generated method stub
		visited[v] = true;
		System.out.print(v + " ");
		
		if(v == arr.length) return;
		for(int i=1;i<arr.length;i++) {
			if(arr[v][i] == 1 && visited[i] == false) DFS(i);
		}
	}

	private static void BFS(int v) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		q.offer(v);
		visited[v] = true;
		
		System.out.print(v+" ");
		
		while(!q.isEmpty()) {
			int n = q.poll();
			for(int i=1;i<arr.length;i++) {
				if(arr[n][i] == 1 && visited[i] == false) {
					visited[i] = true;
					System.out.print(i+" ");
					q.offer(i);
				}
			}
		}
	}

}
