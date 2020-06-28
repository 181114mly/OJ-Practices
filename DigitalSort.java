//数字分类
/**
 * 链接：https://www.nowcoder.com/questionTerminal/473c219f9e4d4ab2851ed388895a9c86
 * 来源：牛客网
 *
 * 给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：
 * A1 = 能被5整除的数字中所有偶数的和；
 * A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
 * A3 = 被5除后余2的数字的个数；
 * A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
 * A5 = 被5除后余4的数字中最大数字。
 *
 * 输入描述:
 * 每个输入包含1个测试用例。每个测试用例先给出一个不超过1000的正整数N，随后给出N个不超过1000的待分类的正整数。数字间以空格分隔。
 *
 * 输出描述:
 * 对给定的N个正整数，按题目要求计算A1~A5并在一行中顺序输出。数字间以空格分隔，但行末不得有多余空格。
 * 若其中某一类数字不存在，则在相应位置输出“N”。
 * 示例1
 * 输入
 * 13 1 2 3 4 5 6 7 8 9 10 20 16 18
 * 输出
 * 30 11 2 9.7 9
 */
package Nowcoder;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DigitalSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int a1=0,a2=0,a3=0,a5=0;
            double a4=0.0;
            double sum=0,count=0;
            int num=0;
            int num1=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%5==0&&arr[i]%2==0){
                    a1+=arr[i];
                }
                else if(arr[i]%5==1){
                    num++;
                    if(num%2==0){
                        a2+=(-arr[i]);
                    }else{
                        a2+=arr[i];
                    }
                }
                else if(arr[i]%5==2){
                    num1++;
                    a3=num1;
                }
                else if(arr[i]%5==3){
                    sum+=arr[i];
                    count++;
                    a4=sum/count;
                }
                else if(arr[i]%5==4){
                    if(arr[i]>a5){
                        a5=arr[i];
                    }
                }
            }
            if(a1==0){
                System.out.print("N"+" ");
            }
            else{
                System.out.print(a1+" ");
            }
            if(a2==0){
                System.out.print("N"+" ");
            }
            else{
                System.out.print(a2+" ");
            }
            if(a3==0){
                System.out.print("N"+" ");
            }
            else{
                System.out.print(a3+" ");
            }
            if(a4==0){
                System.out.print("N"+" ");
            }
            else{
                //使用DecimalFormat类进行数字格式化
                System.out.print(new DecimalFormat("0.0").format(a4) +" ");
            }
            if(a5==0){
                System.out.print("N");
            }
            else{
                System.out.print(a5);
            }
        }
    }
}
