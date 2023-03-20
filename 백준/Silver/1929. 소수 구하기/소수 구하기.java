import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int A[] = new int[n+1];
		
		for(int i=2; i<n+1; i++) {
			A[i] = i; // 배열 초기화
		}
		
		for(int i=2; i<=n; i++) {
			if(A[i]==0) continue;
			for(int j=i+i; j<=n; j+=i) {
				A[j] = 0;
			}
		}
		for(int i=m; i<=n; i++) {
			if(A[i]!=0) {
				System.out.println(A[i]);
			}
			
		}
	}

}
