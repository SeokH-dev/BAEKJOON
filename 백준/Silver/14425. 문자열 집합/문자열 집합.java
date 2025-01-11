import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int criterion = scan.nextInt();
        int examine = scan.nextInt();
        scan.nextLine();
        HashSet<String>criSet = new HashSet<>();
        String[] examArray = new String[examine];

        for (int i = 0; i < criterion; i++) {
            criSet.add(scan.nextLine());
        }

        for (int i = 0; i < examine; i++) {
            examArray[i] = scan.nextLine();
        }

        int count = 0;
        for (int i = 0; i < examine; i++) {
            if (criSet.contains(examArray[i])) {
                count++;
            }
        }
        System.out.println(count);

    }
}