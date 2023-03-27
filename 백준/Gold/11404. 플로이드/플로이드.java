import java.util.Scanner;

public class Main {

	static final int INF = 987654321;
	static int	arr[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 도시 
		int m = sc.nextInt(); // 버스 
		
		arr = new int[n+1][n+1];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				arr[i][j] = INF;
				if(i==j) arr[i][j] = 0; // 자기 자신한테 가는건 0처리
			}
		}
		  // 출발 도시와 도착 도시가 같지만 시간이 다른 입력값이 들어올 수 있음.
        // 예를 들어 "1 4 1"과 "1 4 2"가 입력으로 들어왔으면,
        // "1 4 1"을 택해야 함.
		for(int i=0; i<m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			arr[start][end] = Math.min(sc.nextInt(), arr[start][end]);
		}
		
		// 플로이드 알고리즘의 최단경로 초기화
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(arr[i][j] > arr[i][k] + arr[k][j]) {
						arr[i][j] = arr[i][k] + arr[k][j];
					}
				}
			}
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) { // INF면 0으로 초기화
				if(arr[i][j] == INF) {
					arr[i][j] = 0;
					System.out.print(arr[i][j] +" ");
				}else {
					System.out.print(arr[i][j] +" ");
				}
			}
			System.out.println();
		}
		
	}

}
