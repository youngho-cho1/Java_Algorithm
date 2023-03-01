import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = sc.next().split("");
        int sum = 0;
        for(int i = 0; i < str.length; i++){
            sum += Integer.parseInt(str[i]);
        }
        System.out.print(sum);
	}
}