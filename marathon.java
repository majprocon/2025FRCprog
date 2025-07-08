import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      long t = scanner.nextLong();
      
      while (t-- > 0){
        
      	long a = scanner.nextLong();
      	long b = scanner.nextLong();
      	long c = scanner.nextLong();
      	long d = scanner.nextLong();
      
      	int count = 0;
        
        	if (b > a) count++;
        	if (c > a) count++;
            if (d > a) count++;
        
        System.out.println(count);
        
      }
      scanner.close();
    }
  }
