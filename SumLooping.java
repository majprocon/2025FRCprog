import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = scan.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= a; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
