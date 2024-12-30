import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int[] alpha = new int[26];

        int len = str.length();

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alpha[ch - 'a']++;
            } else if (ch >= 'A' && ch <= 'Z') {
                alpha[ch - 'A']++;
            }
        }

        int maxIndex = -1;
        int maxCount = 0;
        boolean isDuplicate = false;

        for (int i = 0; i < 26; i++) {
            if (alpha[i] > maxCount) {
                maxCount = alpha[i];
                maxIndex = i;
                isDuplicate = false;
            } else if (alpha[i] == maxCount) {
                isDuplicate = true;
            }
        }

        if (isDuplicate) {
            System.out.println("?");
        } else {
            System.out.println((char) ('A' + maxIndex));
        }
    }
}
