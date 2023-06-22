package Chap_2;

public class Ex2_9 {
    public static void main(String[] args) {
        // printf를 이용한 출력 : 같은 값이라도 '다른 형식'으로 출력하고 싶을 때
        // 논리형으로 출력 : %b (불리언 형식)
        // 정수형으로 출력 : %d (10진수) / %o (8진수) / %x (16진수)
        // 실수형으로 출력 : %f (소수점 형식) / %e (지수 형식) / %g (둘 중 간략한 형식)
        // 문자형으로 출력 : %c (문자 형식) / %s (문자열 형식)
        // 줄바꿔서 출력 : 지시자 뒤에 " %n " 붙여주기 (개행문자)

        // 1. 10진수 뿐만 아니라 8진수, 16진수로도 출력 가능
        System.out.printf("%d", 15); // 15 (10진수)
        System.out.printf("%o", 15); // 17 (8진수)
        System.out.printf("%x", 15); // f (16진수)
        System.out.printf("%s", Integer.toBinaryString(15)); // 1111 (2진수)

        // 2. 8진수와 16진수에 접두사 붙여서 출력하고 싶을 때 (#)
        System.out.printf("%#o", 15); // 017 (8진수)

        System.out.printf("%#x", 15); // 0xf (16진수)
        System.out.printf("%#X", 15); // 0XF (16진수) // 대문자 출력 원할 때

        // 3. 실수(x.x) 출력을 위한 지시자
        // 소수점 형식 : %f
        // 지수 형식 : %f
        // 둘 중 간략한 형식 : %g
        float f = 123.4567890f;
        System.out.printf("%f", f); // 123.456787 (소수점 아래 6자리) // float는 7자리까지만 정밀
        System.out.printf("%e", f); // 1.234568e+02 (지수 형식) // e+02는 10의 제곱
        System.out.printf("%g", f); // 123.457 (둘 중 간략한 형식)


        // 4. 실수(x.x)의 자리수 조절 가능(소수점 n자리까지만 출력)
        // 변수 = %전체자리.소수점아래자리f
        double d = 1.23456789;
        System.out.printf("d=%14.10f", d); // 1.2345678900 (빈자리는 0으로 채움)
        System.out.printf("d=%14.3f", d); // 1.235 (반올림해서 원하는 자리까지만 출력)


        System.out.println("------------------");

        // 5. 문자열(string)에서 원하는 길이만큼 출력공간 확보 혹은 일부만 출력 가능
        String url = "www.codechobo.com";
        System.out.printf("[%s]", url);    // 문자열 길이만큼 출력
        System.out.printf("[%20s]", url);  // 20글자 출력공간 확보 & 우측정렬
        System.out.printf("[%-20s]", url); // 20글자 출력공간 확보 & 좌측정렬
        System.out.printf("[%.8s]", url);  // 왼쪽에서부터 8글자만 출력
    }
}
