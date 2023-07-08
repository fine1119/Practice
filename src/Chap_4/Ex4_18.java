package Chap_4;
import java.util.*;

public class Ex4_18 {
    public static void main(String[] args) {
        int menu = 0; // 변수 선언 및 초기화
        int num = 0;

        Scanner scanner = new Scanner(System.in); // 사용자 입력 세팅

        while(true) { // while(true) : 무한반복문 -> break 꼭 필요
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");

            String tmp = scanner.nextLine(); // 입력 받은 값 저장
            menu = Integer.parseInt(tmp); // 문자열로 받은 tmp값 -> 정수형 menu로 변환

            if (menu==0) { // menu에서 0을 입력했을 경우
                System.out.println("프로그램을 종료합니다."); // 프로그램 종료 멘트 후
                break; // while문 탈출
            } else if (!(1 <= menu && menu <= 3)) { // menu를 1~3번이 아닌 것을 입력했을 경우
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)"); // 잘못 선택 멘트 후
                continue; // 다음 반복으로 넘어가서 다시 물어보기
            }

            System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
        }
    }
}
