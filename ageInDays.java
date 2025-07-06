import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextLong();
    long y = n/365;
    
    n -= 365*y;
    long mn = n / 30;
    n -= 30 * mn;
    n %= 30;
    long d = n;
    
    System.out.println(y + " years");
    System.out.println(mn + " months");
    System.out.println(d + " days");
  }
}
