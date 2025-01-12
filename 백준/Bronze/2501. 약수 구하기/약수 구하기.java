import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int num = Integer.parseInt(input[0]);
        int[] measure = new int[num];
        int ordinal = Integer.parseInt(input[1]);

        int repeat = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                measure[repeat++] = i;
            }
            if (repeat == ordinal) {
                break;
            }
        }

        if (measure[ordinal - 1] != 0) {
            bw.write(measure[ordinal - 1] + "\n");
        } else {
            bw.write("0\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}