import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	static boolean arr[];
	static ArrayList<Integer>[] A;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// N = 노드 개수, M = 엣지 개수
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		//그래프 데이터 저장 인접 리스트
		A = new ArrayList[N+1];
		// 방문 기록 저장 배열
		arr = new boolean[N+1];
		
		// A 인접 리스트의 각 ArrayList 초기화
		for(int i=1; i<N+1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		// A 인접 리스트에 그래프 데이터 저장하기
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			//방향성이 없기 때문에 s에서 e도 가능하고 e에서 s도 가능함
			A[s].add(e);
 			A[e].add(s);
		}
		int cnt = 0;
		for(int i=1; i<N+1; i++) {
			if(!arr[i]) {
				cnt++;
				DFS(i);
			}
			
		}
		System.out.println(cnt);
	}
	private static void DFS(int i) {
		// TODO Auto-generated method stub
		if(arr[i]) {
			return;
		}
		arr[i] = true;
		for(int j:A[i]) {
			if(!arr[j]) {
				DFS(j);
			}
		}
	}
	

}
