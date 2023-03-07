import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N+1];
		int max = 0, start = 0, end = K, M=0;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=1; i<=N; i++) {
			arr[i] = Integer.parseInt(st.nextToken()) + arr[i-1];
		}

		for(int i=0; i<N; i++) {
			if (i+K <= N) M = Math.max(M, arr[i+K] - arr[i]);
			else {
				M = Math.max(M, arr[N] - arr[i] + arr[(i + K) % N]);
			}
			
		}
		System.out.println(M);
		
		

		 
		
	}

}
