package LeetCode;

import java.util.Stack;
//901.股票价格跨度
class StockSpanner {
    Stack<Integer> prices=new Stack<>();
    Stack<Integer>  span=new Stack<>();
    public StockSpanner() {

    }
    public int next(int price){
        int num=1;
        while(!prices.isEmpty()&&prices.peek()<=price){
            prices.pop();
            num+=span.pop();
        }
        prices.push(price);
        span.push(num);
        return num;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
