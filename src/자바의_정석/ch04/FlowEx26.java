package 자바의_정석.ch04;

public class FlowEx26 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while ((sum += ++i) <= 100){
            System.out.printf("%d - %d%n", i, sum);
        }
    }
}
