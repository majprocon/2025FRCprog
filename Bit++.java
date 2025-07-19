import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      	int n = scanner.nextInt();
      	scanner.nextLine();
      
      	int X = 0; 
      
      while (n-- > 0){
            String word = scanner.nextLine();
          
            if (word.equals("++X") || word.equals("X++")) {
				X++;
            } else if (word.equals("--X") || word.equals("X--")){
                X--;
            }
     }
     		System.out.println(X);
        	scanner.close();
   }
 }
