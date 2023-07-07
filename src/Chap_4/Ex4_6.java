package Chap_4;
import java.util.Scanner;
public class Ex4_6 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요.>");

        // 화면을 통해 입력 받은 숫자를 변수 month에 저장
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        // Switch 조건문 ver.
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6: case 7: case 8: // case 문을 이렇게 한 줄로 붙여써도 됨
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재의 계절은 가을입니다.");
                break;
            default:
                System.out.println("현재의 계절은 겨울입니다.");
        }

        // if 조건문 ver.
        if(month==3 || month==4 || month==5) {
            System.out.println("현재의 계절은 봄입니다.");
        } else if(month==6 || month==7 || month==8) {
            System.out.println("현재의 계절은 여름입니다.");
        } else if(month==9 || month==10 || month==11) {
            System.out.println("현재의 계절은 가을입니다.");
        } else {
            System.out.println("현재의 계절은 겨울입니다.");
        }
    }
}
