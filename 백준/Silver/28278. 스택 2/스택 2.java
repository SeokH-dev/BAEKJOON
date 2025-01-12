import java.io.*;

class MyStack {
    int[] stack;
    int lastData = 0;

    public MyStack() {
        stack = new int[10];  // 기본 사이즈는 10으로 설정
    }

    public MyStack(int size) {
        stack = new int[size];
    }

    public void push(int data) {
        stack[lastData++] = data;
    }

    public int pop() {
        if (lastData != 0) {
            return stack[--lastData];
        } else {
            return -1;
        }
    }

    public int size() {
        return lastData;
    }

    public int isEmpty() {
        if (lastData == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int peek() {
        if (lastData != 0) {
            return stack[lastData - 1];
        } else {
            return -1;
        }
    }

    public void printAll(BufferedWriter bw) throws IOException {
        for (int i = 0; i < lastData; i++) {
            bw.write(stack[i] + "\n");
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat = Integer.parseInt(br.readLine());
        MyStack stack = new MyStack(repeat);
        MyStack result = new MyStack(repeat);

        for (int i = 0; i < repeat; i++) {
            String[] input = br.readLine().split(" ");
            switch (input[0]) {
                case "1":
                    stack.push(Integer.parseInt(input[1]));
                    break;

                case "2":
                    result.push(stack.pop());
                    break;

                case "3":
                    result.push(stack.size());
                    break;

                case "4":
                    result.push(stack.isEmpty());
                    break;

                case "5":
                    result.push(stack.peek());
                    break;
            }
        }

        result.printAll(bw);

        bw.flush();
        bw.close();
    }
}