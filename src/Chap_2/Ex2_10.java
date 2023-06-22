package Chap_2;
import java.util.Scanner; // 스캐너 클래스를 사용하기 위해 추가
public class Ex2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 스캐너 클래스의 객체 생성

        System.out.print("두자리 정수를 하나 입력해주세요.>");
        
        String input = scanner.nextLine(); // nextLine 메소드 호출 -> 내용 입력(아직은 문자열) -> input 변수에 저장
        int num = Integer.parseInt(input); // 입력 받은 문자열을 정수로 변환

        System.out.println("입력내용 :" + input);
        System.out.printf("num = %d%n", num); // 정수 // 10진수+줄바꿈
    }
}
