package Chap_3;

public class Ex3_6 {
    public static void main(String[] args) {
        // 사칙 연산자
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        System.out.printf("%d / %d = %d%n", a, b, a / b); // 정수형 : 소수점 이하는 버려진다

        System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b); // 한쪽을 실수형으로 변환: 정확한 값을 얻을 수 있음
    }
}
