import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String endDay = "666";
        int count = 0;
        int movieTitle = 0;

        for (int i = 666; num != count; i++) {
            if (String.valueOf(i).contains(endDay)){
                count++;
                movieTitle = i;
            }
        }
        System.out.println(movieTitle);
    }
}