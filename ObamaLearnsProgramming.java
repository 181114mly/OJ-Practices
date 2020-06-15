
//跟奥巴马一起编程(15)
/**
 * 链接：https://www.nowcoder.com/questionTerminal/8af708723b0f45f9a80bc80d78d3566e
 * 来源：牛客网
 *
 * 奥巴马编写了很简单的计算机代码：在屏幕上画一个正方形。现在你也跟他一起画吧！
 *
 * 输入描述:
 * 输入在一行中给出正方形边长N（3<=N<=20）和组成正方形边的某种字符C，间隔一个空格。
 *
 * 输出描述:
 * 输出由给定字符C画出的正方形。但是注意到行间距比列间距大，所以为了让结果看上去更像正方形，我们输出的行数实际上是列数的50%（四舍五入取整）。
 *

 * 输入
 * 10 a
 * 输出
 * aaaaaaaaaa
 * a        a
 * a        a
 * a        a
 * aaaaaaaaaa
 */

package Nowcoder;
import java.util.Scanner;
public class ObamaLearnsProgramming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            //next()和nextInt()函数从遇到的第一个有效的字符开始扫描，遇到第一个空格、Tab、回车\r时结束。
            //nextLine()函数从空格开始扫描直到遇到\n符结束，
            char c = sc.next().charAt(0);
            //输出的行数实际上是列数的50%（四舍五入取整）。
            for (int i = 0; i < (n + 1) / 2; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == ((n + 1) / 2 - 1) || j == 0 || j == n - 1) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}