/**break 语句可以直接强行退出当前的循环，忽略循环体中任何其他语句和循环条件测试
*/
public class BreakKeyword {
    public static void main(String[] args) {
        int[] intary = { 99,12,22,34,45,67,5678,8990 };
        int no = 5678;
        int i = 0;
        boolean found = false;
        for ( ; i < intary.length; i++) {
            if (intary[i] == no) {
                found = true;
                break;
                }
 System.out.println( "还在循环里  ");
}
        if (found) {
            System.out.println(no + " 元素的索引位置在: " + i);
 System.out.println( " 不在循环里 " );        
} 
        else {
            System.out.println(no + " 元素不在数组中");
        }
    }
}
