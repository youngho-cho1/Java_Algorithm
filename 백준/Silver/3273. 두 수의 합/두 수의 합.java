import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		int cnt = 0;
		int start = 0; int end = N-1;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());			
		}
		Arrays.sort(arr);
		int X = Integer.parseInt(br.readLine());
		while(start < end) {
			if(arr[start] + arr[end] == X) {
				cnt ++;
				start ++; end --;
			} else if(arr[start] + arr[end] < X) start ++;
			else end --;
		}
		System.out.println(cnt);
	}

}
