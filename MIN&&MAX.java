import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    long c = scanner.nextLong();

    if (a <= b && a <= c){
      System.out.print(a + " ");
    } else if(b <= a && b <= c) {
      System.out.print(b + " ");
    } else {
      System.out.print(c + " ");
    }
    
     if (a >= b && a >= c){
      System.out.print(a + " ");
    } else if(b >= a && b >= c) {
      System.out.print(b + " ");
    } else {
      System.out.print(c + " ");
    } 
  }
} 

// this is another way 
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    long c = scanner.nextLong();
    System.out.print(Math.min(Math.min(a,b),c) + " ");
    System.out.println(Math.max(Math.max(a,b),c));
  }
}
