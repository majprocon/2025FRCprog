import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long number = scanner.nextLong();

    System.out.println(number *(number + 1) / 2);
  }
}
