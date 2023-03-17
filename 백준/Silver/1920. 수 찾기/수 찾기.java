import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int[] data;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		data = new int[n];
		for(int i=0; i<n; i++) {
			data[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(data);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			boolean search = false;
			int target = Integer.parseInt(st.nextToken());
			int start = 0;
			int end = data.length - 1;
			while(start <= end) {
				int index = (start+end)/2;
				if(data[index] > target) {
					end = index - 1;
				}else if(data[index] < target) {
					start = index + 1;
				}else {
					search = true;
					break;
				}
			}
			if(search) System.out.println(1);
			else System.out.println(0);
		}
		
		
	}

}
