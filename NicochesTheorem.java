//尼科彻斯定理
/**
 * 链接：https://www.nowcoder.com/questionTerminal/dbace3a5b3c4480e86ee3277f3fe1e85
 * 来源：牛客网
 *
 * 验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
 *
 * 例如：
 * 1^3=1
 * 2^3=3+5
 * 3^3=7+9+11
 * 4^3=13+15+17+19
 *
 * 输入描述:
 * 输入一个int整数
 * 输出描述:
 * 输出分解后的string
 *
 * 示例1
 * 输入
 * 6
 * 输出
 * 31+33+35+37+39+41
 */
package Nowcoder;

import java.util.Scanner;

public class NicochesTheorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String s = GetSequeOddNum(n);
            System.out.println(s);
        }
    }

    public static String GetSequeOddNum(int m) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < m; i++) {
            int num = 0;
            num = m * (m - 1) + 1 + 2 * i;
            String result = String.valueOf(num);
            if (i == m - 1) {
                sb.append(result);
            } else {
                sb.append(result + "+");
            }
        }
        return sb.toString();
    }
}
