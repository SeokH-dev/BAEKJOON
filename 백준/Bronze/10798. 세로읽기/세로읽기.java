import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = new String[5];
        int maxLength = 0;

        for (int i = 0; i < 5; i++) {
            str[i] = scan.nextLine();
            maxLength = (maxLength < str[i].length()) ? str[i].length() : maxLength;
        }

        Character[][] arrayStr = new Character[5][maxLength];
        char space = ' ';

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < maxLength; j++) {
                arrayStr[i][j] = (j < str[i].length()) ? str[i].charAt(j) : space;
            }
        }

        String result = "";

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (arrayStr[j][i] != space){
                    result += arrayStr[j][i];
                }
            }
        }

        System.out.println(result);
    }
}