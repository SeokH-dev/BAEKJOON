import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String croAlpha = scan.nextLine();
        int croNum = 0;

        for (int i = 0; i < croAlpha.length(); i++) {
            if (croAlpha.charAt(i) == '=') {
                if ((i - 1) >= 0) {
                    if (croAlpha.charAt(i - 1) == 'c' || croAlpha.charAt(i - 1) == 's' || croAlpha.charAt(i - 1) == 'z') {
                        if ((i - 2) >= 0) {
                            if (croAlpha.charAt(i-1) == 'z' && croAlpha.charAt(i - 2) == 'd') {
                                croNum += 2;
                            } else {
                                croNum++;
                            }
                        } else {
                            croNum++;
                        }
                    }
                }
            } else if (croAlpha.charAt(i) == '-') {
                if ((i - 1) >= 0) {
                    if (croAlpha.charAt(i - 1) == 'c' || croAlpha.charAt(i - 1) == 'd') {
                        croNum++;
                    }
                }
            } else if (croAlpha.charAt(i) == 'j') {
                if ((i - 1) >= 0) {
                    if (croAlpha.charAt(i - 1) == 'n' || croAlpha.charAt(i - 1) == 'l') {
                        croNum++;
                    }
                }
            }
        }

        System.out.println(croAlpha.length() - croNum);
    }
}
