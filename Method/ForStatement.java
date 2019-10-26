/*for循环执行的次数是在执行前就确定的
*语法格式:for(初始化; 布尔表达式; 更新) { //代码语句}
*foreach语句可以遍历数组、集合
*for(元素类型t 元素变量x : 遍历对象obj){ 引用了x的java语句; } 
*/
public class ForStatement {
    public static void main(String[] args) {
        int[] intary = { 1,2,3,4};
        forDisplay(intary);
        foreachDisplay(intary);
    }
    public static void forDisplay(int[] a){  
        System.out.println("使用 for 循环数组");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void foreachDisplay(int[] data){
        System.out.println("使用 foreach 循环数组");
        for (int a  : data) {
            System.out.print(a+ " ");
        }
    }
}
