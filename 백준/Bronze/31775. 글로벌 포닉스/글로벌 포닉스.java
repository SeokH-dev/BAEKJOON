import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Character, Boolean> map = new HashMap<>();

        map.put('l', false);
        map.put('k', false);
        map.put('p', false);

        for (int i=0; i<3; i++){
            String support = scan.nextLine();
            if (map.containsKey(support.charAt(0))){
                map.put(support.charAt(0), true);
            }
        }

        if (map.containsValue(false)){
            System.out.println("PONIX");
        }else {
            System.out.println("GLOBAL");
        }
    }
}