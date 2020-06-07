package nowcoder;
/**买苹果
 * 链接：https://www.nowcoder.com/questionTerminal/61cfbb2e62104bc8aa3da5d44d38a6ef
 * 来源：牛客网
 *
 * 小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。
 * 可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。如果不能购买恰好n个苹果，小易将不会购买。
 *
 * 输入描述:
 * 输入一个整数n，表示小易想购买n(1 ≤ n ≤ 100)个苹果
 *
 * 输出描述:
 * 输出一个整数表示最少需要购买的袋数，如果不能买恰好n个苹果则输出-1
 *
 * 示例1
 * 输入
 * 20
 * 输出
 * 3
 */
//由于6和8都为偶数，所以当n也应该为偶数，当n为奇数时返回-1；n<6时返回-1;当n==10时返回-1.
//当n%8==0时，返回n/8；
//n%8!=0,余数为0、2、4、6。当n%8=0||n%8=6时，不用回溯；
// 若余数为2，只需回溯2次即可，n=18时，因为8+8+2=18, 18%6=0。
// 若余数为4，只需回溯1次即可，n=12时，因为8+4=12,12%6=0;
import java.util.Scanner;
public class BuyApple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            System.out.println(count(n));
        }
    }
    private static int count(int m){
        //当n<6，n为奇数，n等于10时，返回-1.
        if(m<6||m%2!=0||m==10){
            return -1;
        }
        //尽量少的袋数，比如买24个苹果，应使用三个袋子
        if(m%8==0){
            return m/8;
        }
        return 1+m/8;
    }
}
