//十六进制转化为十进制
/**
 * 链接：https://www.nowcoder.com/questionTerminal/8f3df50d2b9043208c5eed283d1d4da6?f=discussion
 * 来源：牛客网
 *
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）
 * 输入描述:
 * 输入一个十六进制的数值字符串。
 *
 * 输出描述:
 * 输出该数值的十进制字符串。
 *
 * 示例1
 * 输入
 * 0xA
 * 输出
 * 10
 */
package Nowcoder;
import java.util.Scanner;
public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            int result=0;
            for(int i=s.length()-1;i>1;i--){
                int num=0;
                char c=s.charAt(i);
                if(c >= 'A' && c <= 'F'){
                    num=c-'A'+10;
                }else if(c >= 'a' && c<= 'f'){
                    num=c-'a'+10;
                }else{
                    num=c-'0';
                }
                result+=num*Math.pow(16,s.length()-1-i);
            }
            System.out.println(result);
        }
    }
}