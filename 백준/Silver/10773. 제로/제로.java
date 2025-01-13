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

    public void deleteTop() {
        if (lastData != 0) {
            stack[--lastData] = 0;
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

    public int addAll() {
        int num = 0;
        for (int i = 0; i < lastData; i++) {
            num += stack[i];
        }
        return num;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat = Integer.parseInt(br.readLine());
        MyStack stack = new MyStack(repeat);

        for (int i = 0; i < repeat; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                stack.deleteTop();
            } else {
                stack.push(num);
            }
        }
        bw.write(stack.addAll() + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}