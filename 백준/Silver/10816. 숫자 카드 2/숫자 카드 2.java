import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> sangCard = new HashMap<>();
        int cardNum = Integer.parseInt(br.readLine());

        String[] sangCards = br.readLine().split(" ");
        for (int i = 0; i < cardNum; i++) {
            int num = Integer.parseInt(sangCards[i]);

            if (!sangCard.containsKey(num)) {
                sangCard.put(num, 1);
            } else {
                sangCard.put(num, sangCard.get(num) + 1);
            }
        }

        int testNum = Integer.parseInt(br.readLine());
        int[] testCard = new int[testNum];
        String[] testCards = br.readLine().split(" ");

        for (int i = 0; i < testNum; i++) {
            int test = Integer.parseInt(testCards[i]);
            testCard[i] = sangCard.getOrDefault(test, 0);
        }

        for (int i = 0; i < testNum; i++) {
            bw.write(testCard[i] + " ");
        }
        
        bw.flush();
        bw.close();
    }
}