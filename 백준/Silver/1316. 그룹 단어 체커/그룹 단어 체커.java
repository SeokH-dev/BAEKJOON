import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repeat = scan.nextInt();
        scan.nextLine(); // 줄바꿈 처리 때문
        String[] str = new String[repeat];
        HashMap<Character, Integer> map = new HashMap<>();
        int num = 0;
        setAlpha(map);

        for (int i = 0; i < repeat; i++) {
            str[i] = scan.nextLine();
            for (int j = 0; j < str[i].length(); j++) {
                if (map.get(str[i].charAt(j)) != -1 && map.get(str[i].charAt(j)) != j - 1) {
                    num++;
                    break;
                } else {
                    map.put(str[i].charAt(j), j);
                }
            }
            setAlpha(map);
        }
        System.out.println(repeat - num);
    }

    public static void setAlpha(HashMap<Character, Integer> map){
        // 알파벳 해시맵 초기화
        for (int i = 0; i < 26; i++) {
            map.put((char) ('a' + i), -1);
        }
    }
}