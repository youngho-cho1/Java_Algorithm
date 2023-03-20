import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n==0) break;
			
			int a[] = new int[2*n+1];
			
			for(int i=2; i<Math.sqrt(a.length); i++) {
				for(int j=i+i; j<a.length; j+=i) {
					a[j] = 1;
				}
			}
			int cnt = 0;
			for(int i=n+1; i<a.length; i++) {
				if(a[i] != 1) cnt++;
			}
			System.out.println(cnt);
		}
	
	}

}
