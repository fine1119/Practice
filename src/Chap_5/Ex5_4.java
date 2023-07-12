package Chap_5;

import java.util.Arrays; // Arrays.toString()을 사용하기 위해 필요

public class Ex5_4 {
    public static void main(String[] args) {
        // 배열 ary 속의 숫자 섞기
        int[] ary = {0,1,2,3,4,5,6,7,8,9}; // 배열의 선언 및 생성
        System.out.println(Arrays.toString(ary)); // 배열에 저장된 값을 출력(섞이기 전)

        for (int i = 0; i < 100; i++) { // 100번 섞기
            int n = (int)(Math.random() * 10); // 1. 임의의 숫자 얻기(0~9)
            int tmp = ary[0]; // 2. 배열 ary 속 첫번째 값을 변수 tmp에 임시로 옮겨 저장해두고
            ary[0] = ary[n]; // 3. 비어있는 첫번째 자리에 '임의의 숫자 얻기로 추출한 자리에 있던 값'을 대신 저장한다
            ary[n] = tmp; // 4. tmp에 옮겨놨던 원래의 첫번째 값을 이제 비어있는 자리에 대신 넣는다
        }
        System.out.println(Arrays.toString(ary)); // 배열에 저장된 값을 출력(섞인 후)
    }
}

// Math.random() : 임의의 수를 랜덤으로 저장하는 메소드
// 범위 : 0.0 <= Math.random() < 1.0
// 따라서 인덱스(0~9)와 같은 임의의 숫자(0~9)를 얻기 위해 10을 곱해주었다
