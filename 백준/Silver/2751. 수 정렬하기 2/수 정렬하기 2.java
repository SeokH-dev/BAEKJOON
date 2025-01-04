import java.io.*;
import java.util.Arrays;

class ArrayList {
    int[] list;
    int lastIndex = 0;

    public ArrayList() {
        list = new int[2]; // 초기 사이즈
    }

    public ArrayList(int size) {
        list = new int[size];
    }

    public void add(int n) {
        if (lastIndex == list.length) {
            list = Arrays.copyOf(list, list.length * 2);
        }
        list[lastIndex++] = n;
    }

    public void sort() {
        mergeSort(list, 0, lastIndex - 1);
    }

    public void mergeSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid =  (start + end) / 2;

        mergeSort(array, start, mid);
        mergeSort(array, mid + 1, end);

        merge(array, start, mid, end);
    }

    public void merge(int[] array, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int start1 = start;
        int start2 = mid + 1;
        int tempIndex = 0;

        while (start1 <= mid && start2 <= end) {
            if (array[start1] < array[start2]) {
                temp[tempIndex++] = array[start1++];
            } else {
                temp[tempIndex++] = array[start2++];
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

    public void printAll(BufferedWriter bw) throws IOException {
        for (int i = 0; i < lastIndex; i++) {
            bw.write(list[i] + "\n");
        }
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());
        ArrayList arrayList = new ArrayList(repeat);

        for (int i = 0; i < repeat; i++) {
            arrayList.add(Integer.parseInt(br.readLine()));
        }

        arrayList.sort();
        arrayList.printAll(bw);

        bw.flush();
        bw.close();
    }
}