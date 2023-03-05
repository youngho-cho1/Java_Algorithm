import java.util.*;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int start = 1, end = 1, sum = 1, cnt = 1;
		
		while(end != N) {
			if (sum == N) {
				cnt++; end++; sum += end;}
			else if(sum > N) {sum -= start; start++;}
			else if(sum < N) {end ++; sum += end;}
		}
		System.out.println(cnt);
		
	}

}
