import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = (int) Math.pow(2, scan.nextInt()) + 1; // 2의 받은 수 제곱 + 1값이 한 변에 있는 점의 개수이기 때문에
        System.out.println(num*num);
    }
}