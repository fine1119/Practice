package Chap_2;

public class Ex2_7 {
    public static void main(String[] args) {
        // 문자열 결합
        // 문자열과 더하면 어떤 타입이라도 연산결과로 문자열을 얻는다
        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);

        System.out.println(7 + " "); // "7 "
        System.out.println(" " + 7); // " 7"

        System.out.println(7 + ""); // "7"
        System.out.println("" + 7); // "7"

        System.out.println("" + "");
        System.out.println(7 + 7 + ""); // 14 + "" = "14"
        System.out.println("" + 7 + 7); // "7" + 7 -> "7" + "7" -> "77"
    }
}
