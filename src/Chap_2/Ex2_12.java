package Chap_2;

public class Ex2_12 {
    public static void main(String[] args) {
        // 타입 간의 변환방법
        // 1. 숫자 -> 문자 : (char)(n + '0') = 'n'
        // 2. 문자 -> 숫자 : 'n' - '0' = n
        // 3. 숫자 -> 문자열 : n + "" = "n"
        // 4. 문자열 -> 숫자 : Integer.parseInt("n") = n / Double.parseDouble("n.n") = n.n
        // 5. 문자열 -> 문자 : "n".charAt(0) = 'n'
        // 6. 문자 -> 문자열 : 'n' + "" = "n"

        String str = "3";

        System.out.println((char)(3 + '0')); // 문자 '3'
        System.out.println('3' - '0'); // 숫자 3
        System.out.println(3 + ""); // 문자열 "3"
        System.out.println(Integer.parseInt("3")); // 숫자 3
        System.out.println(Double.parseDouble("3.14")); // 숫자 3.14
        System.out.println("3".charAt(0)); // 문자 '3'
        System.out.println('3' + ""); // 문자열 "3"
    }
}
