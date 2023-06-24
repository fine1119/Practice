package Chap_3;

public class Ex3_9 {
    public static void main(String[] args) {
        // 산술 변환 : 연산 전에 타입 일치를 위해 발생하는 자동 형변환
        // 규칙1 : 두 피연산자의 타입을 같게 일치시킨다.(보다 큰 타입으로 일치)
        // 규칙2 : 피연산자의 타입이 int보다 작은 타입이면 int로 변환
        // 크기참고 : int < long

        // 틀린 코딩
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a * b; // a * b 결과가 int이기 때문에 범위를 넘어서 오버플로우 발생;;

        System.out.println(c);

        // 고친 코딩
        int d = 1_000_000;
        int e = 2_000_000;

        long f = (long)d * e; // 변수 둘중 하나를 long으로 형변환 해주면 올바른 계산결과가 나옴

        System.out.println(f);
    }
}
