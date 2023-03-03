import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int arr[] = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			arr[i] = sc.nextInt();
		}
		int i = 1;
		int sum = 0;
		
		while(i<=K) sum += arr[i++];

		int max = sum;
		while(i<=N) {
			sum += arr[i] - arr[i-K];
			if(max < sum) max = sum;
			i++;
		}
		System.out.print(max);
		
	
	}

}
