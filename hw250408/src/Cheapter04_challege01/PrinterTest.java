package Cheapter04_challege01;

public class PrinterTest {
    public static void main(String[] args) {
        Printer p = new Printer(100);
        p.print(70);
        System.out.println(p.getNumOfPapers());
    }
}
