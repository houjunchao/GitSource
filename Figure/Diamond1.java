/*输出指定行数的菱形
%表示取余数
双重循环的参数设置，一个会影响到格式，一个会影响到具体的数值
如果有引用具体值的时候，参数设置方式一定注意
*/
public class Diamond1 {
    public static void main(String[] args) {
        print(8); // 输出 8 行的菱形
    }
 
    public static void print(int size) {
        if (size % 2 == 0) {
            size++; // 计算菱形大小
        }
        for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = i + 1; j < size / 2 + 1; j++) {
                System.out.print(" "); // 输出左上角位置的空白
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*"); // 输出菱形上半部边缘
            }
            System.out.println(); // 换行
        }
        for (int i = size / 2 + 1; i < size; i++) {
            for (int j = 0; j < i - size / 2; j++) {
                System.out.print(" "); // 输出菱形左下角空白
            }
            for (int j = 0; j < 2 * size - 1 - 2 * i; j++) {
                System.out.print("*"); // 输出菱形下半部边缘
            }
            System.out.println(); // 换行
        }
    }
}
