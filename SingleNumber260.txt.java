package LeetCode;

import java.util.Arrays;

public class SingleNumber260 {
    public static int[] singleNumber(int[] nums) {
        //先将数组进行异或
        int ret = 0;
        for (int x : nums) {
            ret ^= x;
        }
        //异或的结果ret不为0；找到某一位比特为1
        int bit = 1;
        int i = 0;
        for (; i < 32; i++) {
            if ((ret & (bit << i)) != 0) {
                break;
            }
        }
        //循环结束后，i位置的值为 1 。
        // 将数组按i位置的值为1和0分成两组，
        int a = 0;
        int b = 0;
        for (int x : nums) {
            if ((x & (bit << i)) != 0) {
                // 第一组, 指定位为 1
                a ^= x;
            } else {
                // 第二组, 指定位为 0
                b ^= x;
            }
        }
        int[] arr = {a, b};
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {2, 2, 5, 6, 6, 8};
        int[] result=singleNumber(array);
        System.out.println(Arrays.toString(result));
    }
}
