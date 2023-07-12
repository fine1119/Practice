package Chap_5;

import java.util.Arrays;

public class Ex5_1 {
    public static void main(String[] args) {
        int[] iArr = {100, 95, 80, 70, 60};

        // 배열에 저장된 값을 출력하는 방법 1-1 (줄바꿈ㅇ)
        for (int i = 0; i < iArr.length; i++) {
            System.out.println(iArr[i]);
        }

        // 배열에 저장된 값을 출력하는 방법 1-2 (줄바꿈x)
        for (int i = 0; i < iArr.length; i++) {
            System.out.print(iArr[i] + ",");
        }
        System.out.println();

        // 배열에 저장된 값을 출력하는 방법 2 (제일 간단)
        System.out.println(Arrays.toString(iArr)); // [100, 95, 80, 70, 60]

    }
}
