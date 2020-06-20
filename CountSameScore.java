//统计同成绩学生的人数

/**
 * 链接：https://www.nowcoder.com/questionTerminal/987123efea5f43709f31ad79a318ca69
 * 来源：牛客网
 *
 * 读入N名学生的成绩，将获得某一给定分数的学生人数输出。
 *
 * 输入描述:
 * 测试输入包含若干测试用例，每个测试用例的格式为
 *
 * 第1行：N
 * 第2行：N名学生的成绩，相邻两数字用一个空格间隔。
 * 第3行：给定分数
 *
 * 当读到N=0时输入结束。其中N不超过1000，成绩分数为（包含）0到100之间的一个整数。
 *
 * 输出描述:
 * 对每个测试用例，将获得给定分数的学生人数输出。
 *
 * 示例1
 * 输入
 * 3
 * 80 60 90
 * 60
 * 2
 * 85 66
 * 0
 * 5
 * 60 75 90 55 75
 * 75
 * 0
 * 输出
 * 1
 * 0
 * 2
 */
package Nowcoder;
import java.util.Scanner;
public class CountSameScore {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n==0){
                return;
            }
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int score=sc.nextInt();
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==score){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
