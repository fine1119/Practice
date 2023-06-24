package Chap_3;

public class Ex3_2 {
    public static void main(String[] args) {
        // 증감 연산자 ++과 --
        int i = 5, j = 0;

        j = i++;
        // j = i 먼저 대입하고 -> j = 5가 됨
        // i는 값 1 증가 -> i = 6이 됨
        System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);


        i = 5;
        j = 0;

        j = ++i;
        // i는 값 1 먼저 증가하고 -> i = 6이 됨
        // j = 증가된 i 대입 -> j = 6이 됨
        System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);
    }
}
