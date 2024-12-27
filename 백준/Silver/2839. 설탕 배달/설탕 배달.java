import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kilogram = scan.nextInt();
        int min = kilogram;

        for (int i = 0; i <= kilogram / 3; i++) {
            for (int j = 0; j <= kilogram / 3; j++) {
                if (i * 5 + j * 3 == kilogram) {
                    min = Math.min(min, i + j);
                }
            }
        }

        if (min != kilogram) {
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}