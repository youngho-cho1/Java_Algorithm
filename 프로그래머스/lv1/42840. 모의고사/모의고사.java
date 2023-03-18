import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[] supoja1 = {1, 2, 3, 4, 5};
        int[] supoja2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supoja3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == supoja1[i%5]) answer[0] += 1;
            if(answers[i] == supoja2[i%8]) answer[1] += 1;
            if(answers[i] == supoja3[i%10]) answer[2] += 1;
        }
        List<Integer> list = new ArrayList<Integer>();
        int max = Math.max(answer[0], Math.max(answer[1], answer[2]));
        
        for(int i=0; i<answer.length; i++) if(max == answer[i]) list.add(i+1);
        
        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++) result[i] = list.get(i);
       
        return result;
    }
}