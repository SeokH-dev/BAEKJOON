import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cardNum = scan.nextInt();
        HashSet<Integer>cardSet = new HashSet<>();

        for (int i = 0; i < cardNum; i++) {
            cardSet.add(scan.nextInt());
        }

        int isExist = scan.nextInt();
        int[] cards = new int[isExist];

        for (int i = 0; i < isExist; i++) {
            cards[i] = scan.nextInt();
        }

        for (int i = 0; i < isExist; i++) {
            if (cardSet.contains(cards[i])) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}