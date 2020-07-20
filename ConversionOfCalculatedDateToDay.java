//计算日期到天数的转换
/**
 * 题目描述
 * 根据输入的日期，计算是这一年的第几天。。
 *
 * 详细描述：
 *
 * 输入某年某月某日，判断这一天是这一年的第几天？
 *
 * 输入描述:
 * 输入三行，分别是年，月，日
 *
 * 输出描述:
 * 成功:返回outDay输出计算后的第几天;
 *                                            失败:返回-1
 *
 * 输入
 * 2012
 * 12
 * 31
 *
 * 输出
 * 366
 */
package Nowcoder;
import java.util.Scanner;
public class ConversionOfCalculatedDateToDay {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int year=sc.nextInt();
            int month=sc.nextInt();
            int day=sc.nextInt();
            int count=outDay(year,month,day);
            System.out.println(count);
        }
    }
    public static int outDay(int year,int month,int day){
        if(year<=0||month>12||month<=0||day<=0||day>31){
            return -1;
        }
        int totalDay=0;
        //假设为闰年，闰年每4年一润、且100年不润，或者每400年一润；闰年2月份29天。
        int[] Day={31,29,31,30,31,30,31,31,30,31,30,31};
        if(year%400==0||(year%4==0&&year%100!=0)){
            Day[1]=29;
        }else{
            Day[1]=28;
        }
        for(int i=0;i<month-1;i++){
            totalDay+=Day[i];
        }
        totalDay+=day;
        return totalDay;
    }
}
