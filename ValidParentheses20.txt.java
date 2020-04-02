package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses20 {
    public boolean isValid(String s) {
        Map<Character,Character> map=new HashMap< >();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
           if(c=='('||c=='['||c=='{'){
               stack.push(c);
               continue;
           }
            if(stack.empty()){
                return false;
            }
            char top=stack.pop();
            if(c==map.get(top)){
                continue;
            }
            return false;
        }
         if(stack.empty()){
             return true;
         }
         return false;
    }
}
