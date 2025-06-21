// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Calc
{
    
    int num1;
    int num2;
    int result;
    
    public void perform()
    {
        result = num1 * num2;
    }
    
}

class Main {
    public static void main(String[] args) {
        
        Calc obj = new Calc();
        
        obj.num1 = 5;
        obj.num2 = 6;
        
        obj.perform();
        
        System.out.println(obj.result);
    }
}
