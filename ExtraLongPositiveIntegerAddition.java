//超长正整数相加

/**
 * 链接：https://www.nowcoder.com/questionTerminal/5821836e0ec140c1aa29510fd05f45fc?orderByHotValue=1&mutiTagIds=640_643&page=6&onlyReference=false
 * 来源：牛客网
 * <p>
 * 请设计一个算法完成两个超长正整数的加法。

 *输入描述:
 *输入两个字符串数字
 *输出描述:
 *输出相加后的结果，string型
 *
 *输入
 99999999999999999999999999999999999999999999999999
 *1
 *输出
 *100000000000000000000000000000000000000000000000000
 */


package Nowcoder;
import java.util.*;
public class ExtraLongPositiveIntegerAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(StringAddLongInteger(s1, s2));
        }
    }

    public static String StringAddLongInteger(String addend, String augend) {

        int ret = 0;
        StringBuffer sb = new StringBuffer();
        char[] arr1 = addend.toCharArray();
        char[] arr2 = augend.toCharArray();
        int length1 = arr1.length - 1;
        int length2 = arr2.length - 1;
        while (length1 >= 0 || length2 >= 0 || ret != 0) {
            if (length1 >= 0) {
                ret += arr1[length1] - '0';
                length1 -= 1;
            }
            if (length2 >= 0) {
                ret += arr2[length2] - '0';
                length2 -= 1;
            }
            sb.append(ret % 10);
            ret /= 10;
        }
        sb.reverse();
        return sb.toString();
    }
}
