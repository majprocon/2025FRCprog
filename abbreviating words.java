import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int n = Integer.parseInt(input[0]);

        for (int i = 1; i <= n; i++) {
            String word = input[i];

            if (word.length() <= 10) {
                System.out.println(word);
            } else {
                int count = word.length() - 2;
                String abbr = word.charAt(0) + String.valueOf(count) + word.charAt(word.length() - 1);
                System.out.println(abbr);
            }
        }
      
        scanner.close();
    }
}
