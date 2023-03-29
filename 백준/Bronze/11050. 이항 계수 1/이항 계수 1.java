import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, k;
        int d[][];
        n = sc.nextInt();
        k = sc.nextInt();
        d = new int[n+1][n+1];
        
        //초기화
        for(int i=0; i<=n; i++){
            d[i][i] = 1; // 1개에서 1개 선택
            d[i][1] = i; // 1개에서 모두 선택
            d[i][0] = 1; // i개에서 1개도 선택하지 않은 경우
        }
        // 점화식
        for(int i=2; i<=n; i++){
            for(int j=1; j<i; j++){
                d[i][j] = d[i-1][j] + d[i-1][j-1];
            }
        }
        System.out.println(d[n][k]);
    }
}