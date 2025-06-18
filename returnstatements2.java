// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
      int h = helloWorld(7, 8);
      System.out.println(h);
      int w = helloOtherWorld(6, 3);
      System.out.println(w);
    }
    public static int helloWorld(int x, int y){
        return x * y;
    }
    public static int helloOtherWorld(int s, int a){
        return s / a;
    }
}
