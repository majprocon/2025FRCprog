import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long x = scanner.nextInt();
    long y = scanner.nextInt();
    
    System.out.println(x + " + " + y + " = " + (x+y));
    System.out.println(x + " * " + y + " = " + (x*y));
    System.out.println(x + " - " + y + " = " + (x-y));
  }
}
