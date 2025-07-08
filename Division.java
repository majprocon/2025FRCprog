import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      long t = scanner.nextLong();
      
      while (t-- > 0){
        int rating = scanner.nextInt();
        int divisionNumber;
        
        if (1900 <= rating){
        	divisionNumber = 1;
      } else if (1600 <= rating && 1899 >= rating){
        	divisionNumber = 2;
      } else if (1400 <= rating && 1599 >= rating){
        	divisionNumber = 3;
      } else {
        	divisionNumber = 4;
      }
        System.out.println("Division " + divisionNumber);
      }
      scanner.close();
    }
  }
