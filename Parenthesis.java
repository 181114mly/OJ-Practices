package nowcoder;
//合法括号序列判断

/**
 * 链接：https://www.nowcoder.com/questionTerminal/d8acfa0619814b2d98f12c071aef20d4
 * 来源：牛客网
 *
 * 对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
 * 给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。
 *
 * 测试样例：
 * "(()())",6
 * 返回：true
 *
 * 测试样例：
 * "()a()()",7
 * 返回：false
 */

/**
 * 解题思路：
 *  1. 如果当前字符为'('，则入栈。
 *  2. 如果当前字符为')'：
 *     a、判断栈是否为空，如果栈为空，且输入')'不合法，则返回false；
 *     b、如果当前栈不为空，说明栈中一定含有左括号，进行出栈操作。
 *  3. 其他情况比如出现"a()"等，直接返回false;
 *  4. 遍历完字符串后，判断栈是否为空（比如出现"()()("等情况）。如果栈为空，则表示该字符串是合法的括号串；否则不是合法的括号串。
 */

import java.util.Stack;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        if (A == null || A.length() != n) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] arr = A.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(arr[i]);
            } else if (arr[i] == ')') {
                //如果字符串为")()"或者"())"时，则返回false.
                if (stack.isEmpty()) {
                    return false;
                } else {
                    //说明栈中一定含有左括号，进行出栈操作
                    stack.pop();
                }
                //其他情况比如出现"a()"等
            } else {
                return false;
            }
        }
        //比如出现"()()("情况
        return stack.isEmpty() ? true : false;
    }
}
