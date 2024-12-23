import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repeat = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < repeat; i++){
            String isYes = scan.nextLine();
            int score = 0;
            int conti = 0;

            for (int j = 0; j < isYes.length(); j++){
                if (isYes.charAt(j) == 'O'){
                    score += ++conti;
                }else {
                    conti = 0;
                }
            }
            System.out.println(score);
        }
    }
}