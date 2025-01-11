import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        int sizeA = Integer.parseInt(input[0]);
        int sizeB = Integer.parseInt(input[1]);

        String[] elementsA = br.readLine().split(" ");
        for (int i = 0; i < sizeA; i++) {
            setA.add(Integer.parseInt(elementsA[i]));
        }

        String[] elementsB = br.readLine().split(" ");
        for (int i = 0; i < sizeB; i++) {
            setB.add(Integer.parseInt(elementsB[i]));
        }

        int count = 0;

        // b - a 부터
        for (int element : setA) {
            if (!setB.contains(element)) {
                count++;
            }
        }

        // a- b
        for (int element : setB) {
            if (!setA.contains(element)) {
                count++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}