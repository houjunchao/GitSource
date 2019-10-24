/**以下实例演示了通过 format() 方法来格式化字符串，还可以指定地区来格式化
*/
import java.util.*;
 
public class StringFormat {
    public static void main(String[] args){
        double e = Math.E;
        System.out.format("%f%n", e);
        System.out.format(Locale.CHINA  , "%-10.4f%n%n", e);  //指定本地为中国（CHINA）
    }
}
