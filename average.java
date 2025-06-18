// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
        double[] array = {0.3, 0.4, 0.1, 9.5};
        System.out.println("The average is: " + avg(array));
}
    static double avg(double[] array){
        double sum = 0;
        for (double number : array){
            sum += number;
        }
        double average = sum / array.length;
        return average;
    }
}
