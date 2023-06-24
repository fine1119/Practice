package Chap_3;

public class Ex3_13 {
    public static void main(String[] args) {
        // 나머지 연산자(%) : 나머지값을 결과로 반환 (짝수, 홀수, 배수에 활용)

        // 음수로 나누는 것도 ok -> 나머지값: 절대값으로 계산 & 나눠지는 수의 부호 붙여주면 끝

        System.out.println(-10%8); // -2
        System.out.println(10%-8); // 2
        System.out.println(-10%-8); // -2
    }
}
