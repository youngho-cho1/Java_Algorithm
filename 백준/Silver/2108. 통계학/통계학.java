import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		double sum = 0;
		// 입력과 평균
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		// 중앙값
		Arrays.sort(arr);
		
		//최빈값
		int[] plus = new int[4001];
		int[] minus = new int[4001];
		
		for(int i=0; i<N; i++) {
			if(arr[i] < 0) minus[Math.abs(arr[i])]++; // minus 빈도 저장
			else plus[arr[i]]++; // plus 빈도 저장
		}	
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int Max = 0;
		int result;
		for(int i=0; i<plus.length;i++) {
			Max = Math.max(Max, plus[i]);
		}
		for(int i=0; i<minus.length;i++) {
			Max = Math.max(Max, minus[i]);
		}
		for(int i: arr) {
			if(i<0) {
				if(minus[Math.abs(i)] == Max && !(list.contains(i))) list.add(i);
			}else {
				if(plus[i] == Max && !(list.contains(i))) list.add(i);
			}
		}
		if(list.size()>=2) result = list.get(1);
		else result = list.get(0);
		
		System.out.println((int)Math.round(sum / N));
		System.out.println(arr[N/2]);
		System.out.println(result);
		System.out.println(arr[N-1] - arr[0]);
	}

}
