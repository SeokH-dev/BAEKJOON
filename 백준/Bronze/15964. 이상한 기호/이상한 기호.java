import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long numA = scan.nextLong();
        long numB = scan.nextLong();

        System.out.println((numA+numB)*(numA-numB));
    }
}