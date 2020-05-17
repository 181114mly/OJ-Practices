package nowcoder;
/*题目描述
输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。
例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）*/
import java.util.Stack;
//解题思路：创建一个辅助栈保存栈的压入顺序，比如第一个元素的为1，而弹出栈的第一个元素是4，不相等，继续向辅助栈压入元素
//直到辅助栈的栈顶元素等于弹出栈当前元素，则弹出辅助栈的栈顶元素，出栈元素下移一位。
// 等到入栈元素遍历完后，辅助栈不为空，则不是该压栈序列的弹出序列。

/*例如：
入栈序列：1,2,3,4,5
出栈序列：4,5,3,2,1
1！=4，2入栈
2！=4，3入栈
3！=4，4入栈
4==4，4出栈，此时栈顶元素为3，弹出序列向后移一位，为5
3！=5，5入栈，
5==5，5出栈，此时栈顶元素为3，弹出序列向后移一位，为3
3==3，3出栈，栈顶元素为2，弹出序列向后移一位，为2
2==2，2出栈，栈顶元素为1，弹出序列向后移一位，为1
1==1，1出栈，辅助栈为空。
所以4,5,3,2,1是该栈的弹出顺序
*/
public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length==0||popA.length==0){
            return false;
        }
        Stack<Integer> stack=new Stack<>();
        int index=0;
        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            //此处必须判空是因为调用stack.peek()时，如果stack为空将会返回EmptyStackException异常；while之后会连续pop。
            while(!stack.isEmpty()&&stack.peek()==popA[index]){
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty()?true:false;
    }
}
