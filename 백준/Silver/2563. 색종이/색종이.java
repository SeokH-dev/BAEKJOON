import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean[][] arr = new boolean[100][100];

        int repeat = scan.nextInt();

        for (int i = 0; i < repeat; i++) {
            int row = scan.nextInt();
            int col = scan.nextInt();

            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    arr[99 - col - j][row + k] = true;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}