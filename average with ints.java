import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      int x1 = scanner.nextInt();
      int x2 = scanner.nextInt();
      int x3 = scanner.nextInt();
      
      int max = Math.max(x1, Math.max(x2, x3));
      int min = Math.min(x1, Math.min(x2, x3));
      
      int distance = max - min;
      
      System.out.println(distance);
      
      scanner.close();
    }
}
