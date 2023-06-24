package Chap_3;

public class Ex3_11 {
    public static void main(String[] args) {
        // Math.round() : 소수점 첫째 자리에서 반올림해주는 메소드

        double pi = 3.141592;
        System.out.println(pi); // 3.141592

        double pi_1 = Math.round(pi);
        System.out.println(pi_1); // 3.0

        double pi_2 = Math.round(pi * 1000) / 1000.0;
        // 3.141592 * 1000 = 3141.592
        // Math.round로 소수점 첫째 자리 반올림 = 3142
        // 3142 / 1000.0 = 3.142
        System.out.println(pi_2); // 3.142
    }
}
