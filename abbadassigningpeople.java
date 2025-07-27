import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            x -= a;
            y -= b;
            
            if (x < 0) x = 0;
            if (y < 0) y = 0;
            if (c >= x + y){
              System.out.println("YES");
            } else {
              System.out.println("NO");
        }
        
    }
}
}
