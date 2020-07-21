//空格替换
/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
package Nowcoder;
public class Replacement {
    public String replaceSpace(String iniString, int length) {
        iniString=iniString.replaceAll(" ","%20");
        return iniString;
    }
}
//方法二 StringBuffer的append()方法
class Replacement2{
    public String replaceSpace(String iniString, int length){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<iniString.length();i++){
            char c=iniString.charAt(i);
            if(c!=' '){
                sb.append(c);
            }else{
                sb.append("%20");
            }
        }
        return sb.toString();
    }
}
//方法三 字符串移动
class Replement3 {
    public String replaceSpace(StringBuffer str) {
    	int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        } 
        int newLength=str.length()+2*count;
        int old_end=str.length()-1;
        int new_end=newLength-1;
        str.setLength(newLength);
        while(old_end>=0&&new_end>=0){
            if(str.charAt(old_end)==' '){
               str.setCharAt(new_end--,'0');
               str.setCharAt(new_end--,'2');
               str.setCharAt(new_end--,'%');
                --old_end;
            }else{            
                str.setCharAt(new_end--,str.charAt(old_end));
                 --old_end;
            }
        }
        return str.toString();
    }
}
