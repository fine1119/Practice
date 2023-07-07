package Chap_4;

public class Ex4_13 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (sum <= 100); {  //sum이 100 이하인 동안 반복한다
            System.out.printf("%d - %d%n", i, sum);
        //  System.out.println(i + " - " + sum);
            sum += ++i; // i를 1씩 증가시켜서 sum에 계속 더해나간다.
        }
    }
}
