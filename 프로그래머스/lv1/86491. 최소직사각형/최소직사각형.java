import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_width=0;
        int max_length=0;
        for(int i=0;i<sizes.length;i++){
            int width=Math.max(sizes[i][0],sizes[i][1]);
            int length=Math.min(sizes[i][0],sizes[i][1]);
            max_width=Math.max(max_width,width);
            max_length=Math.max(max_length,length);
        }
        return answer=max_width*max_length;
    }
}