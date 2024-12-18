import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float x, y;
        do {
            x = scan.nextFloat();
            y = scan.nextFloat();
            if (x > 0){
                if (y > 0){
                    System.out.println("Q1");
                } else if (y < 0) {
                    System.out.println("Q4");
                } else {
                    System.out.println("AXIS");
                }
            } else if (x < 0) {
                if (y > 0){
                    System.out.println("Q2");
                } else if (y < 0) {
                    System.out.println("Q3");
                } else {
                    System.out.println("AXIS");
                }
            } else {
                System.out.println("AXIS");
            }
        } while (!(x == 0 && y == 0));
    }
}