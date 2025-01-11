import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer>poKey = new HashMap<>();
        HashMap<Integer, String>numKey = new HashMap<>();

        int monster = scan.nextInt();
        int test = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i <= monster; i++) {
            String name = scan.nextLine();
            poKey.put(name, i);
            numKey.put(i, name);
        }

        for (int i = 0; i < test; i++) {
            String testName = scan.nextLine();
            if (isInteger(testName)) {
                System.out.println(numKey.get(Integer.parseInt(testName)));
            } else {
                System.out.println(poKey.get(testName));
            }
        }
    }

    public static boolean isInteger(String name) {
        try {
            Integer.parseInt(name);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}