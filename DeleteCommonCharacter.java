//删除公共字符
/**
 * 链接：https://www.nowcoder.com/questionTerminal/f0db4c36573d459cae44ac90b90c6212
 * 来源：牛客网
 * <p>
 * 输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。
 * 例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
 * <p>
 * 输入描述:
 * 每个测试输入包含2个字符串
 * <p>
 * 输出描述:
 * 输出删除后的字符串
 */
package nowcoder;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

/**
 * 方法一：使用set
 *将第一个字符串转化为字符数组，将第二个字符串中的每个字符保存到set中，创建一个 StringBuffer对象sb。
 * 遍历字符数组，如果set中包含arr[i]，则跳过此次循环；否则使用sb.append()方法拼接字符串。
 */
public class DeleteCommonCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> set = new HashSet<>();
        while (sc.hasNext()) {
            char[] arr = sc.nextLine().toCharArray();
            String s = sc.nextLine();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }
            for (int i = 0; i < arr.length; i++) {
                if (set.contains(arr[i])) {
                    continue;
                } else {
                    sb.append(arr[i]);
                }
            }
            System.out.println(sb.toString());
        }
    }
}

/**方法二：字符数组+字符串常用方法
 * 将第一个字符串转化为字符数组，遍历字符数组，若第二个字符串不包含arr[i]字符，则直接输出。
 * String.valueOf(参数))，参数为基础类型。格式转换，返回参数的字符串表现形式。
 */
class DeleteCommonCharacter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] arr = sc.nextLine().toCharArray();
            String s = sc.nextLine();
            for (int i = 0; i < arr.length; i++) {
                if (!s.contains(String.valueOf(arr[i]))) {
                    System.out.print(arr[i]);
                }
            }
        }
    }
}