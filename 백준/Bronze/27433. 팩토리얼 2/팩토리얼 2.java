import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        long fact = Factorial(num);
        System.out.println(fact);
    }

    public static long Factorial(int n){
        if (n >= 1){
            return n * Factorial(n-1);
        }
        return 1;
    }
}