package Chap_4;
import java.util.Scanner;

public class Ex4_4 {
    public static void main(String[] args) {
        int score = 0; // 점수
        char grade = ' '; // 학점 (공백으로 초기화해둠)

        System.out.print("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); // 입력 받은 숫자 -> score에 저장

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}