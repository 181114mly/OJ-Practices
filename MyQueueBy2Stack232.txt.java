package LeetCode;

import java.util.Stack;

public class MyQueueBy2Stack232 {
    Stack<Integer> A=new Stack<>();
    Stack<Integer> B=new Stack<>();

    public void push(int x) {
        if(!B.isEmpty()){
            Integer temp=B.pop();
            A.push(temp);
        }
        A.push(x);
    }

    public Integer pop() {
      if(empty()){
          return null;
      }
      while(!A.isEmpty()){
          Integer temp=A.pop();
          B.push(temp);
      }
      return B.pop();
    }

    public Integer peek() {
        if(empty()){
            return null;
        }
        while(!A.isEmpty()){
            Integer temp=A.pop();
            B.push(temp);
        }
        return B.peek();
    }

    public boolean empty() {
      return A.isEmpty()&&B.isEmpty();
    }
}
