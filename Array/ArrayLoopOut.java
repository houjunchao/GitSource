/**
 * 在Java中，字符串属于对象，Java提供了String类来创建和操作字符串
 * 本例中的参数应该叫做字符串数组，这个数组的元素也是字符串，就是String类的对象
 */
public class ArrayLoopOut {
    public static void main(String[] args){
        String[] runoobs = new String[3];
        runoobs[0] = "菜鸟教程";
        runoobs[1] = "菜鸟工具";
        runoobs[2] = "菜鸟笔记";
        for (int i = 0; i < runoobs.length; i++){
            System.out.println(runoobs[i]);
        }
    }
}

