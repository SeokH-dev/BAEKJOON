import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            int temp = i;
            int sum = i;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(i);
                return;
            }

        }
        System.out.println(0);
    }
}