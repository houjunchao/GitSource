import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseAge {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日");                
        //字符串变为时间Date类,解析p格式化f,pf        
        String birthday = "1995年05月02日";        
        Date d = sdf.parse(birthday);                
        //获得时间毫秒值        
        long myTime = d.getTime();        
        //当前日期毫秒值        
        long currentTime = new Date().getTime();        
        System.out.println((currentTime-myTime)/1000/60/60/24/365);    
    }
}
