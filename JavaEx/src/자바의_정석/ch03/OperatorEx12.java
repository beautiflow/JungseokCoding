package 자바의_정석.ch03;

public class OperatorEx12 {
    public static void main(String[] args) {
        char c1 = 'a';  // c1 에는 문자 'a'의 코드값인 97이 저장
        char c2 = c1;  // c1 에 저장되어있는 값이 c2 에 저장된다.
        char c3 = ' '; // c3을 공백으로 초기화한다.

        int i = c1 + 1; // 'a'+1 -> 97+1 -> 98

        c3 = (char)(c1+1);
        c2++;
        c2++;

        System.out.println("i = " + i);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

    }
}
