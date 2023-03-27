import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	static PriorityQueue<Edge> q;
	static int parent[];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		q = new PriorityQueue<>();
		int v = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		parent = new int [v+1];
		for(int i=1; i<=v; i++) {
			parent[i] = i; // 부모 배열은 자기 자신으로 초기ㅗ하
		}
		for(int i=0; i<e; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			q.offer(new Edge(a, b, c));
		}
		
		int sum = 0;
		while(!q.isEmpty()) {
			Edge edge = q.poll();
			// start, end의 부모 찾기
			int parentS = find(edge.start);
			int parentE = find(edge.end);
			
			if(parentS!=parentE) {
				union(parentS, parentE); // 둘을 연결
				sum+=edge.weight; // 가중치 계산
			}
		}
		System.out.println(sum);
		
	}
	private static void union(int parentS, int parentE) {
		parent[parentS] = parentE;
		
	}
	private static int find(int start) {
		if(parent[start] == start) return start;
		else return parent[start] = find(parent[start]);
	}


}
class Edge implements Comparable<Edge>{

	int start;
	int end;
	int weight;
	
	public Edge(int s, int e, int w) {
		this.start = s;
		this.end = e;
		this.weight = w;
	}
	@Override
	public int compareTo(Edge o) { // 가중치 기준 오름차순으로 정렬
		return this.weight - o.weight; 
	}
	
}
