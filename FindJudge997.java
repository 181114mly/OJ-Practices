package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindJudge997 {
    public int findJudge(int N, int[][] trust) {
        if(N==1){
            return 1;
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<trust.length;i++){
            int value=map.getOrDefault(trust[i][1],0);
            map.put(trust[i][1],value+1);
        }
        for(int i=0;i<trust.length;i++){
            if(map.containsKey(trust[i][0])){
                map.remove(trust[i][0]);
            }
        }
        Set<Integer> set=map.keySet();
        for(int m:set){
            if(map.get(m)==N-1){
                return m;
            }
        }
        return -1;
    }
}
