import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        scan.nextLine();
        char[][] chess = new char[row][col];
        char[][] temp = new char[8][8];

        for (int i = 0; i < row; i++) {
            String line = scan.nextLine();
            chess[i] = line.toCharArray();
        }

        // black 부터 나옴
        for (int i = 0; i < 8 * 8; i++) {
            if ((i/8) % 2 != 0) {
                temp[i/8][i%8] = (i % 2 != 0) ? 'B' : 'W';
            } else {
                temp[i/8][i%8] = (i % 2 != 1) ? 'B' : 'W';
            }
        }

        int result = 8 * 8;

        for (int i = 0; i < row - 7; i++) {
            for (int j = 0; j < col - 7; j++) {
                int same = 0;
                int reverse = 0;
                for (int k = 0; k < 8 * 8; k++) {
                    if (temp[k/8][k%8] == chess[k/8+i][k%8+j]) {
                        same++;
                    } else {
                        reverse++;
                    }
                }
                result = Math.min(result, Math.min(same, reverse));
            }
        }

        System.out.println(result);
    }
}