import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        
        while (t-- > 0){
          int a = scanner.nextInt();
          
          if (a == 1){
            System.out.println("HARD");
            return;
          } else {
            continue;
          }
        }
        System.out.println("EASY");
    }
}
