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
		
		int[][] time = new int[N][2]; // N은 시간, [2]는 시작시간, 종료시간
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			time[i][0] = Integer.parseInt(st.nextToken());
			time[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(time, (o1, o2) -> {
			if(o1[1] == o2[1]) { // 종료시간이 같을 경우 시작 시간이 빠른 순
				return o1[0] - o2[0]; // 음수면 o2가 큰 수, 양수면 o1가 큰 수
			}
			return o1[1] - o2[1];
		});
		
		int cnt = 0;
		int end = 0;
		
		for(int i=0; i<N; i++) {
			if(end <= time[i][0]) { // end보다 arr[i][0] 크다면 cnt ++, end를 arr[i][1]로 지정 end는 끝나는 시간
				end = time[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
