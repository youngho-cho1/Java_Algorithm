import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N+1]; // 누적 합
		
	
		st = new StringTokenizer(br.readLine());
		
		for(int i=1; i<=N; i++) {
			arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
		}
		
		int max = 0; int cnt = 0;
		
		for(int i=X; i<=N; i++) {
			if(max < arr[i] - arr[i-X]) {
				max = arr[i] - arr[i-X];
				cnt = 1;
			}else if(max == arr[i] - arr[i-X]) cnt ++;
		}
		if(max == 0) System.out.println("SAD");
		else {
			System.out.println(max);
			System.out.print(cnt);
		}
		
		
	}

}
