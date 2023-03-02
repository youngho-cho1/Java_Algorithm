import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> List = new LinkedList<>();
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for(int i=1; i<=N; i++) List.add(i);
		
		System.out.print("<");
		
		while(!List.isEmpty()) {
			for(int i=1; i<=K; i++) {
				if(i == K) {
					int out = List.remove();
					if(List.size()==0) {
						System.out.print(out);
					}else System.out.print(out+", ");
				}
				else List.add(List.remove());
			}
		}
		System.out.print(">");
	}

}
