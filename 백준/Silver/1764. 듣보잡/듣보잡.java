import java.io.*;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<String> listenSet = new HashSet<>();
        TreeSet<String> LAndWSet = new TreeSet<>();
        String[] input = br.readLine().split(" ");

        int listen = Integer.parseInt(input[0]);
        int watch = Integer.parseInt(input[1]);

        for (int i = 0; i < listen; i++) {
            listenSet.add(br.readLine());
        }

        for (int i = 0; i < watch; i++) {
            String person = br.readLine();
            if (listenSet.contains(person)) {
                LAndWSet.add(person);
            }
        }

        bw.write(LAndWSet.size() + "\n");
        for (String person : LAndWSet) {
            bw.write(person + "\n");
        }
        bw.flush();
        bw.close();
    }
}