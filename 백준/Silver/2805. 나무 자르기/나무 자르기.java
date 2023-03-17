import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int tree[] = new int[n];
		int max = 0;
		int min = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			if(tree[i] > max) {
				max = tree[i];
			}
		}
		while(min <= max) {
			int mid = (min+max) /2;
			long sum = 0;
			
			for(int i=0; i<n; i++) {
				if(tree[i] > mid) sum += tree[i] - mid;
			}
			if(m <= sum) min = mid +1;
			else max = mid -1;
		}
		System.out.println(max);
	}

}
