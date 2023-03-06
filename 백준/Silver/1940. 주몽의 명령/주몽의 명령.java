import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int arr[] = new int[N];
		
		int cnt = 0; int start = 0; int end = N-1; // start == arr[0], end == arr[N-1]
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		while(start < end) {
			if(arr[start] + arr[end] < M) start++;
			else if(arr[start] + arr[end] > M) end--;
			else {
				cnt++;
				start++; end--;
			}
		}
		System.out.print(cnt);
	}

}
