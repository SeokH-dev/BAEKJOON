import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        int a0 = scan.nextInt();
        int c = scan.nextInt();
        int n0 = scan.nextInt();

        int isTrue = (a1 * n0 + a0) <= c * n0 && a1 <= c? 1 : 0;
        System.out.println(isTrue);
    }
}