package Chap_5;

public class Ex5_5 {
    public static void main(String[] args) {
        // 배열의 생성과 선언(ball : 길이 45) // 인덱스 0~44
        int[] ball = new int[45];

        // 배열의 각 요소에 1~45의 값을 저장 // 각 요소 1~45
        for (int i = 0; i < ball.length; i++)
            ball[i] = i + 1; // EX. ball[0]에 1이 저장된다

        // 값을 섞는 데 사용할 변수 선언
        int tmp = 0; // 두 값을 바꾸는 데 사용할 임시변수
        int j = 0; // 임의의 값을 얻어서 저장할 변수


        // 숫자 섞기
        for (int i = 0; i < 6; i++) { // 6번 섞기
            j = (int)(Math.random() * 45); // 1. 임의의 숫자(0~44) 얻어서 변수 j에 저장
            tmp = ball[i];     // 2. 인덱스(i)에 해당하는 자리의 숫자를 차례대로 임시변수에 옮긴다
            ball[i] = ball[j]; // 3. '임의의 숫자 얻기'에 따른 인덱스(j)에 해당하는 자리의 숫자를 비어있는 i 자리로 옮긴다
            ball[j] = tmp;     // 4. 임시변수에 옮겨뒀던 숫자를 비어있는 j 자리로 옮긴다
            // 결론 : 인덱스 i와 j 자리에 있던 값이 서로 바뀐 셈
        }

        // 맨앞에서부터 6개의 요소(숫자) 출력하기
        for (int i = 0; i < 6; i++)
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
    }
}
