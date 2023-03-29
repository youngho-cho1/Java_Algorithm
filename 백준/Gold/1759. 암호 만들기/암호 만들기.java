import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int l, c;
	static char inputs[];
	static char pwd[];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		l = Integer.parseInt(st.nextToken()); // 암호의 자릿수
		c = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		inputs = new char[c]; //입력받은 알파벳 저장
		pwd = new char[l];
		
		for(int i=0; i<c; i++) {
			inputs[i] = st.nextToken().charAt(0);
		}
		Arrays.sort(inputs); // 순서대로 만들어야하기 때문에 정렬
		combination(0, 0);
		
	}

	private static void combination(int idx, int start) {
		// TODO Auto-generated method stub
		if(idx == l) {
			int j = 0; // 자음
			int m = 0; // 모음
			for(char c : pwd) {
					if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') m++;
					else j++;
				}
			if(m>=1 && j>=2) System.out.println(pwd);
			return;
			}
		for(int i=start; i<c; i++) {
			pwd[idx] = inputs[i];
			combination(idx+1, i+1);
		}
		}
	}


