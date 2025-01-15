import java.io.*;

class MyStack {
    String[] stack;
    int lastIndex = 0;

    public MyStack(int size) {
        stack = new String[size];
    }

    public void push(String item) {
        stack[lastIndex++] = item;
    }

    public String pop() {
        if (lastIndex == 0) {
            return null;
        }
        return stack[--lastIndex];
    }

    public int size() {
        return lastIndex;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat = Integer.parseInt(br.readLine());

        for (int i = 0; i < repeat; i++) {
            String[] input = br.readLine().split("");
            MyStack stack = new MyStack(input.length);
            String temp = "";

            for (int j = 0; j < input.length; j++) {
                if (input[j].equals("(")) {
                    stack.push(input[j]);
                } else {
                    temp = stack.pop();
                }

                if (temp == null) {
                    break;
                }
            }

            if (temp != null && stack.size() == 0) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }
}