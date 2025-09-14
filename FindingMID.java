import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    
      for (int i = 0; i < t; i++){
        int a = scan.nextInt();
    	int b = scan.nextInt();
    	int c = scan.nextInt();

      int mid = a + b + c - Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c));
        
        System.out.println(mid);
  	}
  }
}
