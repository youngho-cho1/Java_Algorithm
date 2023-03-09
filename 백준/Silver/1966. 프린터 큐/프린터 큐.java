import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int Test = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<Test; i++) {
			StringTokenizer st =  new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int cnt = 0;
			LinkedList<int[]> Q = new LinkedList<>();
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<N; j++) Q.add(new int[] {j,Integer.parseInt(st.nextToken())});
		
		
			while(!Q.isEmpty()) {
				
				int[] front = Q.poll();
				boolean check = true;
				
				for(int j=0; j<Q.size(); j++) {
					if(front[1] < Q.get(j)[1]) {
						Q.add(front);
						for(int k=0; k<j; k++) Q.add(Q.poll());
						check = false;
						break;
					}
				}
				if(check == false) continue;
				cnt ++;
				if(front[0] == M) break;
			}
			sb.append(cnt+"\n");
		}
		System.out.println(sb);
	}

}

