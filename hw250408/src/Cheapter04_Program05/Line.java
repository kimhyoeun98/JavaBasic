package Cheapter04_Program05;

public class Line {
	private int length;

	public Line(int length) {
		this.length = length;
	}

	public boolean isSameLine(Line other) {
		return this.length == other.length;
	}
}
