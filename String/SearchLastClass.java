/**以下实例中我们通过字符串函数 strOrig.lastIndexOf(Stringname) 来查找子字符串 Stringname 在 strOrig 出现的位置
*/
public class SearchLastClass {
   public static void main(String[] args) {
      String strOrig = "Hello world ,Hello Runoob";
      int lastIndex = strOrig.lastIndexOf("Runoob");
      if(lastIndex == - 1){
         System.out.println("没有找到字符串 Runoob");
      }else{
         System.out.println("Runoob 字符串最后出现的位置： "+ lastIndex);
      }
   }
}
