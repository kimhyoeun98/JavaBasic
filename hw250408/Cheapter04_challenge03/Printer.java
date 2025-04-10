package Cheapter04_challenge03;

public class Printer {
    private int numOfPapers;
    private boolean duplex;

    public Printer(int numOfPapers, boolean duplex) {
        this.numOfPapers = numOfPapers;
        this.duplex = duplex;
    }

    public void print(int amount) {
        int requiredPapers = duplex ? (amount + 1) / 2 : amount;

        if (numOfPapers == 0) {
            System.out.println("용지가 없습니다.");
        } else if (requiredPapers <= numOfPapers) {
            numOfPapers -= requiredPapers;
            System.out.println((duplex ? "양면으로 " : "단면으로 ") 
                + requiredPapers + "장 출력했습니다. 현재 " 
                + numOfPapers + "장 남아 있습니다.");
        } else {
            System.out.println((duplex ? "양면으로 " : "단면으로 ") + 
                "모두 출력하려면 용지가 " + (requiredPapers - numOfPapers) + "매 부족합니다. " + 
                (duplex ? numOfPapers * 2 : numOfPapers) + "장만 출력합니다.");
            numOfPapers = 0;
        }
    }

    public boolean getDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}
