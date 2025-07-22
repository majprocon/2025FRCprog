
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int n = scanner.nextInt();
        scanner.nextLine(); 
 
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
 
            if (word.length() > 10) {
                int count = word.length() - 2;
                String abbr = word.charAt(0) + String.valueOf(count) + word.charAt(word.length() - 1);
                System.out.println(abbr);
            } else {
                System.out.println(word);
            }
        }
 
        scanner.close();
    }
}
