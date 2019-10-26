/**
一个正整数的阶乘（英语：factorial）是所有小于及等于该数的正整数的积，并且有0的阶乘为1。n!=1×2×3×...×n阶乘亦可以递归方式定义：0!=1，n!=(n-1)!×n
*/
public class FactorialClass {
    public static void main(String args[]) {
    for (int counter = 0; counter <= 10; counter++){
        System.out.printf("%d! = %d\n", counter,
        factorial(counter));
    }
    }
    public static long factorial(long number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
    }
}
