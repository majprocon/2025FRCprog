// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class Main {
    
    //public static double area1;
    //public static double area2;
    //public static double area3;
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double b = 0;
        double h = 0;
        double v = 0;
        
        while (b <= 0 || h <= 0 || v <= 0){
            System.out.println("Value base: ");
            b = scanner.nextDouble();
            System.out.println("Value height: ");
            h = scanner.nextDouble();
            System.out.println("Value Volume: ");
            v = scanner.nextDouble();
            
            if (b <= 0 || h <= 0 || v <= 0){
                System.out.println("Make sure the numbers positive bozo!");
            }
        }
        
        areaOfCircle(b);
        System.out.println("Area of Circle: " + areaOfCircle(b));
        
        areaOfRectangle(b,h);
        System.out.println("Area of Rectangle: " + areaOfRectangle(b,h));
        
        areaOfTriangle(b,h);
        System.out.println("Area of Triangle: " + areaOfTriangle(b,h));
        
        volumeOfSphere(b);
        System.out.println("Volume of Sphere: " + volumeOfSphere(b));
        
        volumeOfRectangularPrism(b,h);
        System.out.println("Volume of Rectangular Prism: " + volumeOfRectangularPrism(b,h));
        
        volumeOfPyramid(b,h);
        System.out.println("Volume of Pyramid: " + volumeOfPyramid(b,h));
        
        
}
    public static double areaOfCircle(double r){
        return r * r * Math.PI;
        }
        
        public static double areaOfRectangle(double base, double height){
        return base * height;
        }
        
        public static double areaOfTriangle(double b, double h){
        double triangle = ((b * h) / 2);
        return triangle;
        }
        
        public static double volumeOfSphere(double b){
        return b * b * b * Math.PI * 4.0 / 3.0;
        }
        
        public static double volumeOfRectangularPrism(double b, double h){
        return b * h;
        }
        
        public static double volumeOfPyramid(double b, double h){
        return b * h  / 3;
        }
}
