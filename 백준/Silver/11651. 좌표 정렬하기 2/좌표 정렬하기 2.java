import java.io.*;
import java.util.Arrays;

class ArrayList {
    int[][] list;
    int lastX = 0;

    public ArrayList() {
        list = new int[2][2]; // 초기 사이즈
    }

    public ArrayList(int size) {
        list = new int[size][2];
    }

    public void add(int x, int y) {
        if (lastX == list.length) {
            list = Arrays.copyOf(list, list.length * 2);
        }
        list[lastX][0] = x;
        list[lastX++][1] = y;
    }

    public void sort() {
        mergeSort(list, 0, lastX - 1);
    }

    public void mergeSort(int[][] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(array, start, mid);
        mergeSort(array, mid + 1, end);

        merge(array, start, mid, end);
    }

    public void merge(int[][] array, int start, int mid, int end) {
        int[][] temp = new int[end - start + 1][2];
        int start1 = start;
        int start2 = mid + 1;
        int tempIndex = 0;

        while (start1 <= mid && start2 <= end) {
            if (array[start1][1] < array[start2][1]) {
                temp[tempIndex][0] = array[start1][0];
                temp[tempIndex++][1] = array[start1++][1];
            } else if (array[start1][1] > array[start2][1]) {
                temp[tempIndex][0] = array[start2][0];
                temp[tempIndex++][1] = array[start2++][1];
            } else {
                if (array[start1][0] < array[start2][0]) {
                    temp[tempIndex][0] = array[start1][0];
                    temp[tempIndex++][1] = array[start1++][1];
                } else {
                    temp[tempIndex][0] = array[start2][0];
                    temp[tempIndex++][1] = array[start2++][1];
                }
            }
        }

        while (start1 <= mid) {
            temp[tempIndex++] = array[start1++];
        }

        while (start2 <= end) {
            temp[tempIndex++] = array[start2++];
        }

        for (int i = 0; i < temp.length; i++) {
            array[i + start] = temp[i];
        }
    }

    public void printAll() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i <= lastX - 1; i++) {
            bw.write(list[i][0] + " ");
            bw.write(list[i][1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repeat = Integer.parseInt(br.readLine());
        ArrayList arrayList = new ArrayList(repeat);

        for (int i = 0; i < repeat; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            arrayList.add(x, y);
        }

        arrayList.sort();
        arrayList.printAll();
    }
}