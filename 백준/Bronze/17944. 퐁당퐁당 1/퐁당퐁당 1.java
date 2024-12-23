import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people = scan.nextInt();
        int T = scan.nextInt();
        int num = 0;
        int turn = 1;

        for(int i = 0; i < T; i++){
            num += turn;
            if (num == (people * 2)){
                turn = -1;
            }
            if (num == 1){
                turn = 1;
            }
        }

        System.out.println(num);
    }
}