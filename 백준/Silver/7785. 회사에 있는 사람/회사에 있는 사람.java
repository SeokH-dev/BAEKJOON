import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<String> memberSet = new TreeSet<>(Comparator.reverseOrder());
        int record = scan.nextInt();

        for (int i = 0; i < record; i++) {
            String member = scan.next();
            String isRemain = scan.next();

            if (isRemain.equals("enter")) {
                memberSet.add(member);
            } else if (isRemain.equals("leave")) {
                memberSet.remove(member);
            }
        }
        for (String member : memberSet) {
            System.out.println(member);
        }
    }
}