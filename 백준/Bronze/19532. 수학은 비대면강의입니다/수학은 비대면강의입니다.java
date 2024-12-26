import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] input = new int[6];
        for (int i = 0; i < 6; i++){
            input[i] = scan.nextInt();
        }
        int x = 0, y = 0;

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++){
                boolean temp1 = input[0] * i + input[1] * j == input[2];
                boolean temp2 = input[3] * i + input[4] * j == input[5];
                if (temp1 && temp2){
                    x =i;
                    y = j;
                    break;
                }
            }
            if (x != 0) {
                break;
            }
        }
        System.out.println(x + " " + y);
    }
}