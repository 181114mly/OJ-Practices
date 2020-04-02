package LeetCode;

import java.util.Stack;

public class MinStack155 {
    Stack<Integer> A=new Stack<>();
    Stack<Integer> B=new Stack<>();
    public void push(int x) {
        A.push(x);
        if(B.isEmpty()){
            B.push(x);
        }
        else{
            Integer min=B.peek();
            if(min>x){
                min=x;
            }
            B.push(min);
        }
    }

    public Integer pop() {
        if(A.isEmpty()){
            return null;
        }
        B.pop();
        return A.pop();
    }

    public Integer top() {
        if(A.isEmpty()){
            return null;
        }
        Integer ret=A.peek();
        return ret;
    }

    public Integer getMin() {
        if(B.isEmpty()){
            return null;
        }
        return B.peek();
    }
}
