public class Triangle {
	public static void main(String[] args){
for(int i = 1; i <= 5; i++){
    for(int j = 5 ;i <= j; j--)//建立1号图形
        System.out.print(" ");
    for(int j = 1; j <= i; j++)//建立2号图形
        System.out.print("*");
    for(int j = 1; j < i; j ++)//建立3号图形
        System.out.print("*");
 System.out.println(" ");
}
}
}
