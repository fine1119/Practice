package Chap_3;

public class Ex3_10 {
    public static void main(String[] args) {
        // 산술 변환 : 연산 전에 타입 일치를 위해 발생하는 자동 형변환
        // 규칙1 : 두 피연산자의 타입을 같게 일치시킨다.(보다 큰 타입으로 일치)
        // 규칙2 : 피연산자의 타입이 int보다 작은 타입이면 int로 변환
        // 크기참고 : int < long

        long a = 1_000_000 * 1_000_000; // int * int 계산결과가 나와버림(오버플로우 오류)
        long b = 1_000_000 * 1_000_000L; // int * long으로 올바른 계산결과 나옴

        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }
}
