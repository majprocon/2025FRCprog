import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long t = scanner.nextLong();
    
    while (t-- > 0 ){
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      
      int min = Integer.MAX_VALUE;
      
      for (int c = a; c <= b; c++){
        int value = ((c - a) + (c - b));
        min = value;
      }
      	System.out.println(min);
    }
  }
}
