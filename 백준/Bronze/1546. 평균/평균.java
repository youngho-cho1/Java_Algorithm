import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine(); // 버퍼를 비워주기 위한 sc.nextLine() 사용
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		int max = 0;
		int score = 0;
		double sum = 0;
		
		for(int i=0; i<N; i++) {
			score = Integer.parseInt(st.nextToken()); 
			 if(score > max) max = score; 
			 sum += score;
		}
		System.out.println(sum/N/max*100); 

	}

}
