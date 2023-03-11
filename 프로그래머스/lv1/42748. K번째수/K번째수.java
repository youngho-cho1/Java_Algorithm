import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
		int[] copy = {};
		int start = 0; int end = 0;
		
		for(int i=0; i<commands.length; i++) {
			start = commands[i][0];
			end = commands[i][1];
			copy = Arrays.copyOfRange(array, start-1, end);
			Arrays.sort(copy);
			answer[i] = copy[commands[i][2]-1];
 		} 
		
		return answer;
    }

}