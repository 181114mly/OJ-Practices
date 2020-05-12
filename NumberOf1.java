package nowcoder;
//题目描述：输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
//在计算机中，整形数据用补码表示。所以正数和负数的计算方法相同。
public class NumberOf1 {
    //方法1 求模运算
    public int NumberOf1a(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            if(n%2!=0){
                count++;
            }
            n>>>=1;
        }
        return count;
    }
    //方法2 操作数移动
    public int NumberOf1b(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            if((n&1)!=0){
                count++;
            }
            n>>>=1;
        }
        return count;
    }
    //方法3 设置一个标志位，标志位移动，操作数不移动
    public int NumberOf1c(int n) {
        int count=0;
        int flag=1;
        for(int i=0;i<32;i++){
            if((n&flag)!=0){
                count++;
            }
            flag<<=1;
        }
        return count;
    }
    //方法4 用循环让m&（m-1）运算，直到m变成0,与运算多少次，就有多少个1.
    public int NumberOf1d(int n) {
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
