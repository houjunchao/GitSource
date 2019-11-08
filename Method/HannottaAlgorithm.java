/**汉诺塔算法
 * 有三根杆子A,B,C。A杆上有若干碟子
 * 每次移动一块碟子,小的只能叠在大的上面
 * 把所有碟子从A杆全部移到C杆上
 */
public class HannottaAlgorithm {
    public static void main(String[] args) {
        int nDisks = 3;
        doTowers(nDisks, 'A', 'B', 'C');
    }
    public static void doTowers(int topN, char from, char inter, char to) {
        if (topN == 1){
            System.out.println("Disk 1 from "
            + from + " to " + to);
        }else {
            doTowers(topN - 1, from, to, inter);
            System.out.println("Disk "
            + topN + " from " + from + " to " + to);
            doTowers(topN - 1, inter, from, to);
        }
    }
}
