import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int column = scan.nextInt();
        int height = scan.nextInt();

        int[][] arrayA = new int[column][height];

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < height; j++) {
                arrayA[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < height; j++) {
                arrayA[i][j] += scan.nextInt();
            }
        }

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(arrayA[i][j] + " ");
            }
            System.out.println();
        }
    }
}