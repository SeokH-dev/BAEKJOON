import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repeat = scan.nextInt();

        for (int i = 0; i < repeat; i++) {
            int dollar = scan.nextInt();
            int quarter = dollar / 25;
            int dime = (dollar %= 25) / 10;
            int nickel = (dollar %= 10) / 5;
            int penny = dollar % 5;
            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}