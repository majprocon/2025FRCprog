// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me 3 numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = 0;
        
        for (int i = a; i < b+1; i++){
            if (i % c == 0){
                x++;
            }
        }
        System.out.println("The numbers are divisible by: " + x); 
    }
}
