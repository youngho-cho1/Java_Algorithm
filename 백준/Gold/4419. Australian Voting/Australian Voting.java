import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static String candidate[];
	static int vote[];
	static Queue<Integer>[] q;
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	String input;
    	N = Integer.parseInt(br.readLine());
    	int idx = 1;
    	vote = new int[N+1];
    	q = new LinkedList[1002];
    	candidate = new String[N+1];
    	
    	for(int i=1; i<=N; i++) {
    		candidate[i] = br.readLine();
    	}
    	
    	while((input = br.readLine()) != null && !input.isEmpty()) { 	 
    	  st = new StringTokenizer(input," ");
    	  q[idx] = new LinkedList<>();
    	  for(int i=1; i<=N; i++) {
    		  q[idx].offer(Integer.parseInt(st.nextToken()));
    	  }
    	  idx ++;
    	}
    	
    	while(true) {
    		int max = Integer.MIN_VALUE;
    		int min = Integer.MAX_VALUE;
    		
    		for(int i=1; i<idx; i++) {
    			while(vote[q[i].peek()] == -1) {
    				q[i].remove();
    			}
    			vote[q[i].peek()]++;
    		}

    		for(int i=1; i<=N; i++) {
    			max = Math.max(max, vote[i]);
    			if(vote[i] != -1) {
    				min = Math.min(min, vote[i]);
    			}
    		}
    		if(max*2 > idx-1 || max == min) {
    			for(int i=1; i<=N; i++) {
    				if(vote[i] == max) {
    					System.out.println(candidate[i]);
    				}
    			}
    			return;
    		}
    		for(int i=1; i<=N; i++) {
    			if(vote[i] == min) {
    				vote[i] = -1;
    			}else if(vote[i] != -1) {
    				vote[i] = 0;
    			}
    		}
    	}
    	
    	
    }
}