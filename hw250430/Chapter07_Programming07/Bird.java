package Chapter07_Programming07;

public class Bird implements Flyable {
    @Override
    public void speed() {
        System.out.println("속도");
    }

    @Override
    public void height() {
        System.out.println("높이");
    }
}