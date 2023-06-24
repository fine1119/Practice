package Chap_3;

public class Ex3_5 {
    public static void main(String[] args) {
        // 형변환 연산자 : (타입)피연산자
        // 형변환(casting) : 변수나 상수의 타입을 다른 타입으로 변환하는 것
        // 자동 형변환 : 기존값을 최대한 보존하는 선에서 자동으로 처리되는 경우도 있음

        double d = 85.4;
        int score = (int) d;

        System.out.println("d=" + d); // 형변환 후에도 피연산자 값에는 영향x // 85.4
        System.out.println("score=" + score); // double값을 int로 형변환 // 85

    }
}
