/**
 * Java语言中，String类是用来表示字符串的，有自己的创建方法
 * 基本数据类型的包装类，也可以定义数组
 * 数组也有自己的Arrays类
 * 特别是包装类，有装箱和拆箱之说，当赋值的时候，就要装箱，当运算的时候，就要
 * 拆箱，如果是基本的数据类，就叫做变量的初始化
 * 类的对象也可以做参数，数组也可以做参数，参数也有自己的类型
 */
public class OverSideMethod {
    public static void printArray(Integer[] inputArray) {
        for (Integer element : inputArray){
            System.out.printf("%s ", element);
            System.out.println();
        }
    }
    public static void printArray(Double[] inputArray) {
        for (Double element : inputArray){
            System.out.printf("%s ", element);
            System.out.println();
        }
    }
    public static void printArray(Character[] inputArray) {
        for (Character element : inputArray){
            System.out.printf("%s ", element);
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
        System.out.println("输出整型数组:");
        printArray(integerArray);
        System.out.println("\n输出双精度型数组:");
        printArray(doubleArray);
        System.out.println("\n输出字符型数组:");
        printArray(characterArray);
    }
}
