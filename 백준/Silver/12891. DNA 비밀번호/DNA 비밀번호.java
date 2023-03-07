import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int myArr[];
	static int checkArr[];
	static int checkCnt;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int result = 0;
		char arr[] = new char[s];
		checkArr = new int[4];
		myArr = new int[4];
		checkCnt = 0;
		
		arr = br.readLine().toCharArray();
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if(checkArr[i] == 0) checkCnt++;
		}
		
		for(int i=0; i<p; i++) {
			Add(arr[i]);
		}
		
		if(checkCnt == 4) result++;
		
		for(int i=p; i<s; i++) {
			int j = i-p; // j는 start 포인트 느낌
			Add(arr[i]);
			Remove(arr[j]);
			if(checkCnt == 4) result++;
		}
		System.out.println(result);
	}

	private static void Remove(char c) {
		switch(c) {
		case 'A':
			if(myArr[0] == checkArr[0]) checkCnt--;
			myArr[0] --;
			break;
		case 'C':
			if(myArr[1] == checkArr[1]) checkCnt--;
			myArr[1] --;
			break;
		case 'G':
			if(myArr[2] == checkArr[2]) checkCnt--;
			myArr[2] --;
			break;
		case 'T':
			if(myArr[3] == checkArr[3]) checkCnt--;
			myArr[3] --;
			break;
		}
	}

	private static void Add(char c) {
		switch(c) {
		case 'A':
			myArr[0] ++;
			if(myArr[0] == checkArr[0]) checkCnt++;
			break;
		case 'C':
			myArr[1] ++;
			if(myArr[1] == checkArr[1]) checkCnt++;
			break;
		case 'G':
			myArr[2] ++;
			if(myArr[2] == checkArr[2]) checkCnt++;
			break;
		case 'T':
			myArr[3] ++;
			if(myArr[3] == checkArr[3]) checkCnt++;
			break;
		}
	}

}
