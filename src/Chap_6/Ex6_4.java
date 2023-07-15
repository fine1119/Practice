package Chap_6;

public class Ex6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath(); // 2. 객체 생성

        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);
    }
}

class MyMath { // 1. 클래스 작성
    long add(long a, long b) {
        long result = a + b;
        return result;
        // return a + b; // 위 두 줄을 이렇게 한 줄로 표현도 가능
    }
    long subtract(long a, long b) { return a - b; }
    long multiply(long a, long b) { return a * b; }
    double divide(double a, double b) { return a / b; }
}
