package 수업.D230809;

public class Ex4_13 {
    public static void main(String[] args) {
        String value = "12ot34";
        char ch = ' ';
        boolean isNumber = true;

        // 반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
        for(int i = 0; i < value.length(); i++){
            ch = value.charAt(i);

            if(ch < '0' || ch > '9'){
                isNumber = false;
            }
            else {
                continue;
            }
        }

        if(isNumber){
            System.out.println(value+"는 숫자입니다.");
        }
        else {
            System.out.println(value+"는 숫자가 아닙니다.");
        }
    }
}
