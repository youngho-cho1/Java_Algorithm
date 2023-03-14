import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		int arr[] = new int[N];
		int sort[] = new int[N];
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) sort[i] = arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(sort);
		
		int num = 0;
		for(int i:sort) {
			// 중복 값 체크 조건
			if(!map.containsKey(i)) {
//				System.out.println("i: "+i);
//				System.out.println("num: "+num);
				map.put(i, num);
				num++;
				// 우선순위 높은것 == 작은 값을 map에 넣고 옆칸으로 이동
			}
		}
//		for(int key:arr) {
//			System.out.print(map.get(key)+" "); // map.get(key)에 대한 value 출력
//		}
		for(int key:arr) {
			sb.append(map.get(key)+" ");
		}
		System.out.println(sb);
		
		
	}

}
