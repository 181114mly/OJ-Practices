//n个数里出现次数大于等于n/2的数
/**
 * 链接：https://www.nowcoder.com/questionTerminal/eac8c671a0c345b38aa0c07aba40097b
 * 来源：牛客网
 *
 * 输入n个整数，输出出现次数大于等于数组长度一半的数。
 *
 * 输入描述:
 * 每个测试输入包含 n个空格分割的n个整数，n不超过100，其中有一个整数出现次数大于等于n/2。
 *
 * 输出描述:
 * 输出出现次数大于等于n/2的数。
 *
 * 输入
 * 3 9 3 2 5 6 7 3 2 3 3 3
 * 输出
 * 3
 */
package nowcoder;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
//为什么要用字符串进行运算呢？因为n不知道，不能确定输入个数。
//输入字符串，字符串按空格进行拆分为字符串数组，遍历数组，将数组中每个元素使用Integer.parseInt转化为整数，放入map中。
//在map中查找输出出现次数大于等于n/2的数，输出即可。
public class count {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            Map<Integer, Integer> map = new HashMap<>();
            String str=sc.nextLine();
            String[] arr=str.split(" ");
            for(String s:arr){
                int m=Integer.parseInt(s);
                int value=map.getOrDefault(m,0);
                map.put(m,value+1);
            }
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()>=arr.length/2){
                    System.out.println(entry.getKey());
                }
            }
        }
    }
}
