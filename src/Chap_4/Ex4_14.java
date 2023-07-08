package Chap_4;
import java.util.*;

public class Ex4_14 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요.(예:12345)>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine(); // 화면으로 입력받는 내용을 변수 tmp에 저장
        num = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환


        while(num != 0) {
            sum = sum + num%10;
            System.out.printf("sum=%3d num=%d%n", sum, num);

            num = num / 10;
        }
        System.out.println("각 자리수의 합: " + sum); // 12345 입력 시 : 1+2+3+4+5
    }
}
