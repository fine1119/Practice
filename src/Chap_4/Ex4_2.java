package Chap_4;

public class Ex4_2 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x=%d 일 때, 참인 것은%n", x); // 지시자 %d = 변수 x의 값

        if(x==0) System.out.println("x==0");
        if(x!=0) System.out.println("x!=0");
        if(!(x==0)) System.out.println("!(x==0)");
        if(!(x!=0)) System.out.println("!(x!=0)");

        x = 1;
        System.out.printf("x=%d 일 때, 참인 것은%n", x); // 지시자 %d = 변수 x의 값

        if(x==0) System.out.println("x==0");
        if(x!=0) System.out.println("x!=0");
        if(!(x==0)) System.out.println("!(x==0)");
        if(!(x!=0)) System.out.println("!(x!=0)");
    }
}
