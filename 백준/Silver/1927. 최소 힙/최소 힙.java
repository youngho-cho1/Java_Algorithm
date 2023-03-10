import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException   {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());// 1~n

        int input;
        PriorityQueue<Integer> Q = new PriorityQueue<Integer>();
        for (int i = 0; i < n; i++) {
            input = Integer.parseInt(br.readLine());
            if (input>0) {
                Q.add(input);
            } else {
                if (!Q.isEmpty()) {
                    System.out.println(Q.poll());
                }
                else{
                    System.out.println(0);
                }
            }
        }
        br.close();
    }
}
