import java.io.*;

class MyStack {
    String[] stack;
    int lastData = 0;

    public MyStack() {
        stack = new String[10]; // 기본 사이즈
    }

    public MyStack(int size) {
        stack = new String[size];
    }

    public void push(String data) {
        stack[lastData++] = data;
    }

    public String pop() {
        if (lastData != 0) {
            return stack[--lastData];
        } else {
            return null;
        }
    }

    public int isEmpty() {
        return lastData == 0 ? 1 : 0;
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
            boolean isValid = true;

            for (String s : input) {
                if (s.equals("(")) {
                    stack.push(s);
                } else if (s.equals(")")) {
                    if (stack.isEmpty() == 1) {
                        isValid = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (isValid && stack.isEmpty() == 1) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
