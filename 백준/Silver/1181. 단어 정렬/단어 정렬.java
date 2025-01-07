import java.io.*;
import java.util.Arrays;

class ArrayList {
    String[] list;
    int lastIndex = 0;

    public ArrayList() {
        list = new String[2]; // 초기 사이즈
    }

    public ArrayList(int size) {
        list = new String[size];
    }

    public void add(String str) {
        if (lastIndex == list.length) {
            list = Arrays.copyOf(list, list.length * 2);
        }
        list[lastIndex++] = str;
    }

    public void sort() {
        mergeSort(list, 0, lastIndex - 1);
    }

    public void mergeSort(String[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(array, start, mid);
        mergeSort(array, mid + 1, end);

        merge(array, start, mid, end);
    }

    public void merge(String[] array, int start, int mid, int end) {
        String[] temp = new String[end - start + 1];
        int start1 = start;
        int start2 = mid + 1;
        int tempIndex = 0;

        while (start1 <= mid && start2 <= end) {
            if (array[start1].length() < array[start2].length()) {
                temp[tempIndex++] = array[start1++];
            } else if (array[start1].length() > array[start2].length()) {
                temp[tempIndex++] = array[start2++];
            } else if (array[start1].compareTo(array[start2]) < 0){
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

    public void printAll() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String duplicate = "";

        bw.write(list[0] + "\n");
        for (int i = 1; i <= lastIndex - 1; i++) {
            duplicate = list[i - 1];
            if (!duplicate.equals(list[i])) {
                bw.write(list[i] + "\n");
            }
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
            arrayList.add(br.readLine());
        }

        arrayList.sort();
        arrayList.printAll();
    }
}