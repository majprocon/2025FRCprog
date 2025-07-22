import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        Long t = scanner.nextLong();
      	scanner.nextLine();
      
      for (int i = 0; i < t; i++){
        String s = scanner.nextLine();
        
        if (s.equalsIgnoreCase("YES")){
          System.out.println("YES");
        } else 
          System.out.println("NO");
      	}
      
      scanner.close();
   }
}
