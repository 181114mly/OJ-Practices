package LeetCode;
import java.util.LinkedList;
import java.util.Queue;

public class MyStackBy2Quene225 {
    Queue<Integer> A=new LinkedList<>();
    Queue<Integer> B=new LinkedList<>();

    public void push(int x) {
        A.offer(x);
    }

    public Integer pop() {
        if(empty()){
            return null;
        }
        while(A.size()>1){
            Integer front=A.poll();
            B.offer(front);
        }
        int ret=A.poll();
        swap( );
        return ret;
    }

    private void swap( ) {
        Queue<Integer> temp=A;
        A=B;
        B=temp;
    }

    public Integer top() {
        if(empty()){
            return null;
        }
        while(A.size()>1){
            Integer front=A.poll();
            B.offer(front);
        }
        int ret=A.poll();
        B.offer(ret);
        swap( );
        return ret;
    }

    public boolean empty() {
        return A.isEmpty()&&B.isEmpty();
    }
}
