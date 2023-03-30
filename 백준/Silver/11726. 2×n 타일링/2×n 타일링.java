import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long d[] = new long[1001];
		d[1] = 1; // n=1 타일 채우는 경우의 수
		d[2] = 2; // n=2 타일 채우는 경우의 수
		
		for(int i=3; i<=n; i++) {
			d[i] = (d[i-1] + d[i-2]) % 10007;
		}
		System.out.println(d[n]);
		
	}

}
