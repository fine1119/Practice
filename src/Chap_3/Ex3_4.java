package Chap_3;

public class Ex3_4 {
    public static void main(String[] args) {
        // 부호 연산자 +와 -
        // 부호 연산자 - : 부호를 반대로 변경해줌
        int i = -10;
        i = +i; // +는 있으나마나 해서 i = i를 쓴 것과 같음
        System.out.println(i); // -10

        i = -10;
        i = -i; // --10 -> +10
        System.out.println(i); // 10
    }
}
