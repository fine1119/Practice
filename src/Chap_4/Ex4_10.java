package Chap_4;

public class Ex4_10 {
    public static void main(String[] args) {
        int sum = 0;

        /* 내가 하고자 하는 것
        sum = sum + 1;
        sum = sum + 2;
        sum = sum + 3;
        sum = sum + 4;
        sum = sum + 5;
         */

        for (int i = 1; i <= 5; i++) {
            sum += i; // sum = sum + i(1,2,3,4,5)
            //System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
            System.out.println("1부터 " + i + " 까지의 합: " + sum);
        }
    }
}
