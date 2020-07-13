package Nowcoder;
//字母统计
/**
 * 链接：https://www.nowcoder.com/questionTerminal/de7bf0945c1c4bd1aa9d49573b831f3c
 * 来源：牛客网
 *
 * 输入一行字符串，计算其中A-Z大写字母出现的次数
 *
 * 输入描述:
 * 案例可能有多组，每个案例输入为一行字符串。
 *
 *
 * 输出描述:
 * 对每个案例按A-Z的顺序输出其中大写字母出现的次数。
 */

import java.util.Scanner;
public class CharacterSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[26];
        while (sc.hasNext()) {
            String s = sc.nextLine();
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c>='A'&&c<='Z'){
                   arr[c-'A']++;
                }
            }
            for(int i=0;i<26;i++){
                System.out.printf("%c:%d\n",'A'+i,arr[i]);
            }
        }
    }
}
