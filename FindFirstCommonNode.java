package nowcoder;
//题目描述
//输入两个链表，找出它们的第一个公共结点。
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class FindFirstCommonNode {
    public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null){
            return null;
        }
        int length1=size(pHead1);
        int length2=size(pHead2);
        ListNode cur1=pHead1;
        ListNode cur2=pHead2;
        int length=0;
        if(length1>length2){
            length=length1-length2;
            for(int i=0;i<length;i++){
                cur1=cur1.next;
            }
        }
        else{
            length=length2-length1;
            for(int i=0;i<length;i++){
                cur2=cur2.next;
            }
        }
        while(cur1!=null&&cur2!=null){
            if(cur1==cur2){
                return cur1;
            }else{
                cur1=cur1.next;
                cur2=cur2.next;
            }
        }
        return null;
    }
    public int size(ListNode pHead){
        int length=0;
        for(ListNode cur=pHead;cur!=null;cur=cur.next){
            length++;
        }
        return length;
    }
}
