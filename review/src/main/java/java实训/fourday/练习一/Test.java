package java实训.fourday.练习一;

/**
 * @author 小白
 * @create 2021/6/24
 */
public class Test {
    public static void main(String[] args) {
        Printer p1 = new DotMatrixPrinter();
        Printer p2 = new InKpetPrinter();
        Printer p3 = new LaserPrinter();
        p1.print();
        p2.print();
        p3.print();
    }
}
