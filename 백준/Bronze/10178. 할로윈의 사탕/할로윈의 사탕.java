import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int repeat = scan.nextInt();

        for (int i = 0; i < repeat; i++){
            int c = scan.nextInt(); // candy 수
            int v = scan.nextInt(); // 형제의 수
            System.out.println("You get " + c/v + " piece(s) and your dad gets " + c%v + " piece(s).");
        }
    }
}