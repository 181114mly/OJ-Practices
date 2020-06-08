//计算糖果

/**
 * 链接：https://www.nowcoder.com/questionTerminal/02d8d42b197646a5bbd0a98785bb3a34?f=discussion
 * 来源：牛客网
 *
 * A,B,C三个人是好朋友,每个人手里都有一些糖果,我们不知道他们每个人手上具体有多少个糖果,但是我们知道以下的信息：
 * A - B, B - C, A + B, B + C. 这四个数值.每个字母代表每个人所拥有的糖果数.
 * 现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。这里保证最多只有一组整数A,B,C满足所有题设条件。
 *
 * 输入描述:
 * 输入为一行，一共4个整数，分别为A - B，B - C，A + B，B + C，用空格隔开。 范围均在-30到30之间(闭区间)。
 *
 * 输出描述:
 * 输出为一行，如果存在满足的整数A，B，C则按顺序输出A，B，C，用空格隔开，行末无空格。
 * 如果不存在这样的整数A，B，C，则输出No
 *
 * 输入
 * 1 -2 3 4
 * 输出
 * 2 1 3
 */

//解方程，消元
package nowcoder;
import java.util.Scanner;
public class CalculateCandy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A, B, C;
        int[] arr = new int[4];
        while (sc.hasNextInt()) {
            for (int i = 0; i < 4; i++) {
                arr[i] = sc.nextInt();
            }
            A = (arr[0] + arr[2]) / 2;
            C = (arr[3] - arr[1]) / 2;
            B = A - arr[0];
            if (A - B == arr[0] && B - C == arr[1] && A + B == arr[2] && B + C == arr[3]) {
                System.out.print((int) A + " " + (int) B + " " + (int) C);
            }
            else {
                System.out.print("No");
            }
        }
    }
}
