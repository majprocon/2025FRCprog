import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextInt();
    long m = scanner.nextInt();
    long a = n%10;
    long b = m%10;
    System.out.println(a+b);
  }
}
