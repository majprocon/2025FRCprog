// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int i = scanner.nextInt();
        System.out.println(i);
    
    if(i % 3 == 0 && i % 5 == 0 && i != 0){
        System.out.println("FizzBuzz");
    }
    else if (i % 3 == 0 && i != 0){
        System.out.println("Fizz");
}
    else if (i % 5 == 0 && i != 0){
        System.out.println("Buzz");
        }
    }
}
