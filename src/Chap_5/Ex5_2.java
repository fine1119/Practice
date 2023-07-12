package Chap_5;

public class Ex5_2 {
    public static void main(String[] args) {
        int sum = 0;    // 총합을 저장하기 위한 변수 sum
        float avg = 0f; // 평균을 저장하기 위한 변수 avg

        int[] score = {100, 88, 100, 100, 90}; // 배열(참조변수)의 선언 및 생성 // 초기값 설정

        for (int i = 0; i < score.length; i++) { // 배열에 저장된 값을 출력해서
            sum = sum + score[i]; // 총합 구하기 : score[0]+score[1]+score[2]+score[3]+score[4]
        }
        avg = sum / (float)score.length; // 계산결과를 정확한 실수형 값으로 얻으려 float로 형 변환
        // 배열의 길이 = 배열 요소의 개수
        // 총합 나누기 요소개수 = 평균

        System.out.println("총합 : " + sum); // 478
        System.out.println("평균 : " + avg); // 95.6
    }
}
