package 수업.D230804;

public class Num2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                if(i == j) {
                    System.out.printf("[%d, %d]", i, j);
                }
                else {
                    System.out.print("      ");
                }
            }
            System.out.println();
        }
    }
}
