package LeetCode;

import java.util.Scanner;
//输入为一个正整数N(1 ≤ N ≤ 1,000,000) 输入15
//输出一个最小的步数变为Fibonacci数.  输出 2
public class Fib {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
          int N=input.nextInt();
        int i=0;
          for(;i<N;i++){
              if(fib(i)>=N){
                  break;
              }
          }
          int p=Math.abs(fib(i)-N);
          int q=Math.abs(fib(i-1)-N);
          if(p>q){
              System.out.println(q);
          }
          else{
              System.out.println(p);
          }
    }
    private static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}
