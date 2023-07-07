package Chap_4;

import java.util.Scanner;

public class Ex4_5 {
    public static void main(String[] args) {
        int score = 0; // 점수
        char grade = ' ', opt = ' '; // 학점, 세부학점

        System.out.print("점수를 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); // 입력 받은 숫자 -> score에 저장

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }
        System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);

    }
}
