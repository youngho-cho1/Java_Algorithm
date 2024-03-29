import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long gcd = GCD(a,b);
		
		// 문제에서 입력한 두 숫자의 최대공약수를 구하고 그 수만큼 1을 출력
		for(int i=0; i<gcd; i++) sb.append("1");
//		for(int i=0; i<gcd; i++) System.out.print("1"); // 시간초과
		
		System.out.println(sb);
	}

	private static long GCD(long a, long b) {
		// TODO Auto-generated method stub
		//b의 값이 0이면 a를 그대로 리턴
		if(b == 0) return a;
		else { 
			long r = a%b;
			return GCD(b,r);
		}
	}

}
