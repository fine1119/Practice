package Chap_3;

public class Ex3_14 {
    public static void main(String[] args) {
        // 문자열의 비교 : (== 대신) equals()라는 메소드 쓰는 걸 권장 (객체가 달라도 내용 비교 가능)
        // 대소문자 구별 안하고 문자열 비교 : equalsIgnoreCase() 메소드 사용

        // 객체 생성 방법1
        String str1 = "abc";
        String str2 = "abc"; // new 안 쓰고 간단히 써도 됨(String만 허용)
        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true

        // 객체 생성 방법2
        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str1 == str2); // false (==를 쓰면 안되는 이유)
        System.out.println(str1.equals(str2)); // true
    }
}
