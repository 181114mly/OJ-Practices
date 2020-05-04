package day1;
//下厨房
import java.util.HashSet;
import java.util.Scanner;
public class Exercise{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        HashSet<String> set=new HashSet<>();
        while(input.hasNext()){
            String str=input.next();
            String arr[]=str.split(" ");
            for(String s:arr){
                set.add(s);
            }
        }
        System.out.println(set.size());
    }
}