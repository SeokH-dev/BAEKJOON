import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Double> credit = new HashMap<>();
        credit.put("A+", 4.5);
        credit.put("A0", 4.0);
        credit.put("B+", 3.5);
        credit.put("B0", 3.0);
        credit.put("C+", 2.5);
        credit.put("C0", 2.0);
        credit.put("D+", 1.5);
        credit.put("D0", 1.0);
        credit.put("F", 0.0);

        int isPass = 0;
        double totalGrade = 0;
        double total = 0;

        for (int i = 0; i < 20; i++) {
            scanner.next(); // 과목 명 받기
            double grade = scanner.nextDouble();
            String whatCredit = scanner.next();
            
            if (whatCredit.equals("P")) {
                isPass++;
            } else {
                total += (grade * credit.get(whatCredit));
                totalGrade += grade;
            }
        }

        double result = total / totalGrade;
        System.out.println(result);
    }
}