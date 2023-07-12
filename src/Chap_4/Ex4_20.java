package Chap_4;
import java.util.*;

public class Ex4_20 {
    public static void main(String[] args) {
        int menu = 0, num = 0; // 변수 선언 및 초기화

        Scanner scanner = new Scanner(System.in); // 사용자 입력 세팅

        outer: // while문에 outer라는 이름을 붙임
        while(true) { // while(true) : 무한반복문 -> break 꼭 필요
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");
            String tmp = scanner.nextLine(); // 사용자한테 입력받은 값을 변수 tmp에 저장
            menu = Integer.parseInt(tmp); // 문자열로 받은 tmp값 -> 정수형으로 변환해서 변수 menu에 저장


            if (menu == 0) { // menu에서 0을 입력했을 경우
                System.out.println("프로그램을 종료합니다."); // 프로그램 종료 멘트 후
                break; // while문 탈출
            } else if (!(1 <= menu && menu <= 3)) { // menu를 1~3번이 아닌 것을 입력했을 경우
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)"); // 잘못 선택 멘트 후
                continue; // 다음 반복으로 넘어가서 다시 물어보기
            }


            for(;;) { // 무한반복문 -> break 꼭 필요
                System.out.print("계산할 값을 입력하세요.(계산 종료:0, 전체 종료:99)>");
                tmp = scanner.nextLine(); // 사용자한테 입력받은 값을 변수 tmp에 저장
                num = Integer.parseInt(tmp); // 문자열로 받은 tmp값 -> 정수형으로 변환해서 변수 num에 저장

                if(num==0)
                    break; // 계산 종료. for문을 벗어난다
                if(num==99)
                    break outer; // 전체 종료. for문과 while문(outer)을 모두 벗어난다

                switch(menu) {
                    case 1:
                        System.out.println("result=" + num*num);
                        break;
                    case 2:
                        System.out.println("result=" + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result=" + Math.log(num));
                        break;
                }
            } // for(;;)
        } // while의 끝
    } // main의 끝
}
