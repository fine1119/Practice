package Chap_4;

public class Ex4_16 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while(true) {
            if(sum > 100)
                break;    // break문이 실행되면 밑의 2줄은 실행되지 않고 while문을 벗어난다.
            ++i;
            sum = sum+i;
        }
        System.out.println("i=" + i);
        System.out.println("sum=" + sum);
    }
}
