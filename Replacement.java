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
