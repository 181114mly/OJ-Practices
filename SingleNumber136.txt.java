package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber136 {
    public static int singleNumber(int[] nums) {
        //方法一
      Map<Integer,Integer> map=new HashMap<>();
      for(int x:nums){
          Integer value=map.get(x);
          if(value==null){
              map.put(x,1);
          }
          else{
              map.put(x,value+1);
          }
      }
      for( Map.Entry<Integer,Integer> entry:map.entrySet()){
          if(entry.getValue().equals(1)){
              return entry.getKey();
          }
      }
      return 0;
    }
    //方法二
    public static int singleNumber2(int[] nums){
        int ret=0;
        for(int x:nums){
            ret^=x;
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] arr={2,2,6,6,8};
        System.out.println(singleNumber(arr));
        System.out.println(singleNumber2(arr));
    }
}
