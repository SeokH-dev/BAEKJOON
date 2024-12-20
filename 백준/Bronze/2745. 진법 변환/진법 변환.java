import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number = scan.next();

        int system = scan.nextInt();

        int result = Integer.parseInt(number, system);

        System.out.println(result);
    }
}