import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = "codeforces";
    int t = scan.nextInt();
    scan.nextLine();
    
      for (int i = 0; i < t; i++){
        char c = scan.nextLine().charAt(0);
        int index = word.indexOf(c);
        
        if (word.indexOf(c) != -1){
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
  	}
  }
}
