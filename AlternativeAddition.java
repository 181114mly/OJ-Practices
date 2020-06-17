//另类加法
/**
 * 请编写一个函数，将两个数字相加。不得使用+或其他算数运算符。
 *
 * 给定两个int A和B。请返回A＋B的值
 *
 * 测试样例：
 * 1,2
 * 返回：3
 */

/**解题思路：位运算
 * 按位异或运算    1^1=0 1^0=1 0^0=0
 * 按位"求和"     1+1=0 1+0=1 0+0=0
 *
 *  按位与运算   1&1=1 1&0=0 0&0=0
 * “进位”运算    1+1=1 1+0=0 0+0=0
 */
package Nowcoder;
import java.util.Scanner;
public class AlternativeAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int m=sc.nextInt();
            int n=sc.nextInt();
            System.out.println(addAB(m,n));
        }
    }
    public static int addAB(int A,int B){
        //位运算A^B是不考虑进位的结果，（A&B）<<1是求得的进位。
        while(B!=0){
            int sum=A^B;
            int carry=(A&B)<<1;
            A=sum;
            B=carry;
        }
        return A^B;
    }
}
