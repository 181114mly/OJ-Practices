package LeetCode;
import java.util.Map;
import java.util.HashMap;
public class RandomListClone {

    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public class Solution {
        public RandomListNode Clone(RandomListNode pHead)
        {
            Map<RandomListNode,RandomListNode> map=new HashMap<>();
            for(RandomListNode cur=pHead;cur!=null;cur=cur.next){
                map.put(cur,new RandomListNode(cur.label));
            }
            for(RandomListNode cur=pHead;cur!=null;cur=cur.next){
                RandomListNode newNode=map.get(cur);
                newNode.next=map.get(cur.next);
                newNode.random=map.get(cur.random);
            }
            return map.get(pHead);
        }
    }
}
