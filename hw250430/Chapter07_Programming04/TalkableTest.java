package Chapter07_Programming04;

public class TalkableTest {
	static void speak(Talkable t) {
        t.speak();
    }

    public static void main(String[] args) {
        speak(new Korean());
        speak(new American());
    }
}



