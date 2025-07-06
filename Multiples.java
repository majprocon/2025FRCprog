import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();

    if ((b % a) == 0 || (a % b) == 0){
      System.out.println("Multiples");
    } else if ((a / b) != 0 || (b / a) != 0) {
      System.out.println("No Multiples");
    }
  }
}
