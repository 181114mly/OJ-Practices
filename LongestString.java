package nowcoder;

import java.util.Scanner;

//字符串中找出连续最长的数字串

/**
 * 链接：https://www.nowcoder.com/questionTerminal/bd891093881d4ddf9e56e7cc8416562d
 * 来源：牛客网
 *
 * 读入一个字符串str，输出字符串str中的连续最长的数字串
 *
 * 输入描述:
 * 个测试输入包含1个测试用例，一个字符串str，长度不超过255。
 * 输出描述:
 * 在一行内输出str中里连续最长的数字串。
 *
 * 示例1
 * 输入
 * abcd12345ed125ss123456789
 * 输出
 * 123456789
 */
public class LongestString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            int max=0,count=0,end=0;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c>='0'&&c<='9'){
                    count++;
                    if(max<count){
                        max=count;
                        end=i;
                    }
                }else{
                    count=0;
                }
            }
            /*for(int i=end-max+1;i<=end;i++){
                System.out.print(s.charAt(i));
            }
            System.out.println();*/
            System.out.println(s.subSequence(end-max+1,end+1));
        }
    }
}
