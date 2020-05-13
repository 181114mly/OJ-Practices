package nowcoder;
/*题目描述
给定一个无序数组arr，其中元素只能是1或0。求arr所有的子数组中0和1个数相等的最长子数组的长度 
输入描述:
第一行一个整数N，表示数组长度
接下来一行有N个数表示数组中的数
输出描述:
输出一个整数表示答案
示例1
输入
5
1 0 1 0 1
输出
4
*/
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class MaximumLength {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=input.nextInt();
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
        //map中的key存放累加和，value存放这个累加和第一次出现的下标。
        Map<Integer,Integer> map=new HashMap<>();
        //当数组的累积和为0时，会用到map.put(0,-1);
        map.put(0,-1);
        int sum=0;
        int maxLength=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                maxLength=Math.max(maxLength,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        System.out.print(maxLength);
    }
}
