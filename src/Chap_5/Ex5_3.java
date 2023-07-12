package Chap_5;

public class Ex5_3 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95}; // 배열의 선언 및 생성

        int max = score[0]; // 배열의 첫번째 값을 최대값으로 변수 max에 저장(초기 설정)
        int min = score[0]; // 배열의 첫번째 값을 최소값으로 변수 min에 저장(초기 설정)

        for (int i = 1; i < score.length; i++) {  // 배열에 저장된 값을 '두번째 값'부터 출력해서
            if(score[i] > max) {         // 비교해서 더 크면
                max = score[i];          // 변수 max에 저장
            } else if(score[i] < min) {  // 비교해서 더 작으면
                min = score[i];          // 변수 min에 저장
            }
        }

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
