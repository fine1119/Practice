package Chap_3;

public class Ex3_16 {
    public static void main(String[] args) {
        // 논리 부정 연산자 !
        
        // 문자 ch는 소문자가 아니다
        // 버전1 : ch < 'a' || ch > 'z'
        // 버전2 : !('a' <= ch && ch <= 'z') : 이게 더 직관적
    }
}
