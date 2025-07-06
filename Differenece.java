import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextInt();
    long b = scanner.nextInt();
    long c = scanner.nextInt();
    long d = scanner.nextInt();
    
    System.out.println("Difference = " + (a * b - c * d));
  }
}
