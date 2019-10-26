/*输出九九乘法表
*图形应用双重循环，特别注意的是双重循环的参数关系，都是在表达式里
设置条件，双重参数在第二层进行比较，也叫内部比较
如果内部小于外部参数，说明内部参数的初始值小
如果内部大于外部参数，说明内部参数的初始值大
小于号与自加相关，大于号与自减相关
*/
public class MultiplicationTable1 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++) {
            for(int j=i;j>=1;j--) {
                System.out.print(j+"×"+i+"="+i*j+"\t");// \t 跳到下一个TAB位置
            }
            System.out.println();
        }
    }
}
