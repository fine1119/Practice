package Chap_5;
import java.util.Arrays;

public class Ex5_6 {
    public static void main(String[] args) {
        // String 배열
        String[] strArr = {"가위", "바위", "보"}; // index: 0~2 // strArr[0]: 가위, strArr[1]: 바위, strArr[2]: 보
        System.out.println(Arrays.toString(strArr)); // [가위, 바위, 보]

        for (int i = 0; i < 10; i++) { // 10번 반복하기
            int tmp = (int)(Math.random()*3); // 범위: 0~2
            System.out.println(strArr[tmp]); // strArr[]을 활용해서 0~2 대신 가위~보를 출력되게 함
        }
    }
}
