package LeetCode;
//调整数组顺序使奇数位于偶数前面
//并保证奇数和奇数，偶数和偶数之间的相对位置不变。
//保证稳定性，直接插入排序
public class ReOrderArray {
    public void reOrderArray(int [] array) {
        if(array.length==0||array.length==1){
            return;
        }
        //k表示已排序区间中奇数的个数
        int k=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                int j=i;
                while(j>k){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                    j--;
                }
                k+=1;
            }
        }
    }
}
