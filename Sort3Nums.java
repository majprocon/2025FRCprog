import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    long c = scanner.nextLong();
    
    long[] original = {a,b,c};
    
    long[] sorted = {a,b,c};
    Arrays.sort(sorted);
    
    for (long num: sorted){
      System.out.println(num);
    }
    
    System.out.println();
    
    for (long num: original){
      System.out.println(num);
    }
  }
}
