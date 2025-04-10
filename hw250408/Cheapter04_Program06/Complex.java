package Cheapter04_Program06;

public class Complex {
    private double real;
    private double imag;

    // 실수만 받는 생성자
    public Complex(double real) {
        this.real = real;
        this.imag = 0.0;
    }

    // 실수와 허수 받는 생성자
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // 출력 메서드
    public void print() {
        System.out.println(real + " + " + imag + "i");
    }
}


