package LeetCode;
//链表中环的入口节点
public class EntryNodeOfLoop {
    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null||pHead.next==null){
            return null;
        }
        ListNode slow=pHead;
        ListNode fast=pHead;
        while(slow!=null&&fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode cur=slow;
                while(pHead!=cur){
                    pHead=pHead.next;
                    cur=cur.next;
                }
                return cur;
            }
        }
        return null;
    }
}
