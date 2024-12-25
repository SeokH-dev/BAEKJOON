import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numCard = scan.nextInt();
        int total = scan.nextInt();
        int[] card = new int[numCard];

        for (int i = 0; i < numCard; i++) {
            card[i] = scan.nextInt();
        }

        int adj = 0;

        for (int i = 0; i < numCard; i++){
            for (int j = i + 1; j < numCard; j++){
                for (int k = j + 1; k < numCard; k++){
                    int sum = card[i] + card[j] + card[k];
                    adj = (adj <= sum && sum <= total) ? sum : adj;
                }
            }
        }
        System.out.println(adj);
    }
}