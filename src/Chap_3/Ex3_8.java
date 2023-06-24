package Chap_3;

public class Ex3_8 {
    public static void main(String[] args) {
        // 작은 자료형 -> 큰 자료형으로 형변환 : 자동으로 가능
        // 큰 자료형 -> 작은 자료형으로 형변환 : 수동으로 써줘야 가능
        // 크기참고 : byte < int < long

        byte a = 10;
        byte b = 30;
        byte c = (byte)(a * b); // 300을 바이트(-128~127)에 욱여넣어봄

        System.out.println(c); // 값손실 발생(44)
    }
}
