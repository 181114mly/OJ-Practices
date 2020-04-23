package LeetCode;

import java.util.*;

public class TopKFrequent692 {
    public List<String> topKFrequent(String[] words, int k) {
//1、统计单词出现的次数
        Map<String,Integer> map=new HashMap<>();
        for(String s:words){
            Integer count=map.getOrDefault(s,0);
            map.put(s,count+1);
        }
        //2、把统计到的字符串放入顺序表中。keySet得到的的是Set,Set中存放着所有的key
        List<String> list=new ArrayList<>(map.keySet());
        //3、排序，
        Collections.sort(list,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                int count1=map.get(o1);
                int count2=map.get(o2);
                if(count1==count2){
                    return o1.compareTo(o2);
                }
                return count2-count1;
            }
        });
        //sublist返回list集合的[0,k)
        return list.subList(0,k);
    }
}
