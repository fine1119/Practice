package Chap_3;

public class Ex3_7 {
    public static void main(String[] args) {
        // 산술 변환 : 연산 전에 타입 일치를 위해 발생하는 자동 형변환
        // 규칙1 : 두 피연산자의 타입을 같게 일치시킨다.(보다 큰 타입으로 일치)
        // 규칙2 : 피연산자의 타입이 int보다 작은 타입이면 int로 변환

        System.out.println(5/2); // 2
        System.out.println(5/(float)2); // 2.5
    }
}
