import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
      	int t = scanner.nextInt();
      	      
      	while (t-- > 0){
          int []a = new int[8];
          
            for (int i = 0; i < 7; i++){
              	a[i] = scanner.nextInt();
            }
        System.out.println(a[0] + " " + a[1] + " " + (a[6] - a[1] - a[0]));
     }
   }
 }
