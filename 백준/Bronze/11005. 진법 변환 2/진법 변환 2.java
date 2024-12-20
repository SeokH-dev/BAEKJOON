import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        int system = scan.nextInt();

        String result = Integer.toString(number, system);

        System.out.println(result.toUpperCase());
    }
}