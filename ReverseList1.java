package nowcoder;
//题目描述
//实现单链表的逆转函数，输入一个链表，反转链表后，返回翻转之后的链表。
public class ReverseList {
    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode pre=null;
        ListNode cur=head;
        ListNode newHead=null;
        while(cur!=null){
            ListNode next=cur.next;
            if(next==null){
                newHead=cur;
            }
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return newHead;
    }
}
