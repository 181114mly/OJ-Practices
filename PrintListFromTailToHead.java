package nowcoder;
//从尾到头打印链表
//题目描述
//输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
import java.util.ArrayList;
import java.util.Stack;
public class PrintListFromTailToHead {
    static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
           this.val = val;
        }
    }
    //方法一 栈+ArrayList
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        Stack<Integer> stack=new Stack<>();
        ListNode cur=listNode;
        while(cur!=null){
            stack.push(cur.val);
            cur=cur.next;
        }
        ArrayList list=new ArrayList();
        while(!stack.isEmpty()){
            list.add(stack.peek());
            stack.pop();
        }
        return list;
    }
    //方法二 list.add(int index,E element)
    //用于在列表的指定位置插入指定元素，并将当前处于该位置的元素及其后续元素的索引加 1。
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList list=new ArrayList();
        while(listNode!=null){
            list.add(0,listNode.val);
            listNode=listNode.next;
        }
        return list;
    }
}
