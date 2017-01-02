/**
 * This code is an expiremental caculator, I should have fix its bugs.
 * However, I didn't , so it's yours to debug.
 *
 * Btw, this code only handles ... I mean it should handle single 
 * binrary expression, like:
 * 
 *      java Calc 24343+7857
 *      java Calc 48/57
 *      java Calc 7899*484
 * 
 * Spaces inside expression are not allowed, and it doesn't not handle signs (+,-).
 * 
 *       ----
 *      |    |
 *      |    |  WARNING:
 *      |    |  
 *      |    |  YOU MUST USED JAVA VERSION 1.7xx or newer to run this code.
 *      |    |
 *      \    /
 *       \  / 
 *        ..     
 *       |  |
 *        --   
 *
 * 
 * Have a nice day :)
 *
 * @author Your worst nightmare
 */
import java.util.Scanner;

public class Calc{
    // You suppose to use it to hold the expression you provide 
    static String ssssss = "";
    public static void main(String args []){
        // check if you pass me the expression
        boolean notfound = args.length == 0;

        if (notfound = false){
            System.out.println("Ok, I got it");
            String ssssss = args[0];
        }
        else if (notfound == true)
            System.out.println("Please feed me an expression");
            ssssss = "";
        
        new Evaluator();
    }
}

class Evaluator {
    String s = "1+1";
    public void Evaluater(){
        this.s = Calc.ssssss;
        this.eval();
    }
    /** 
    * Do the real evaluation 
    */
    public void eval(){
        String [] ar = this.split();
        String op = ar[1];
        
        if (op == "+" | op == "-" | op == "*" | op == "/"){
            new RealCalculator(Integer.parseInt(ar[0]),op,Integer.parseInt(ar[2]));
        }else{
            System.out.println("Not supported operator");
        }
    }
    /** 
    * it should return ["1","+","1"] for s = "1+1" 
    */
    public String[] split(){
        String ar[] = new String[3];
        String v = "";
        int counter = 0;
        // split first number 
        
        while (counter < this.s.length() && Character.isDigit(this.s.charAt(counter))){
            v += s.charAt(counter);
            counter++;
        }
        ar[0] = v;
        v = "";

        // I added (+ "") because charAt() method returns Char not String
        ar[1] = this.s.charAt(counter++) + "";

        while (counter < this.s.length() & Character.isDigit(this.s.charAt(counter))){
            v += s.charAt(counter);
            counter++;
        }
        ar[2] = v;
        return ar;
    }
}

class Base{
    public Base(int x, String op, int y){
        // call the suitable method based on "op"
        switch(op){
            case "+":
                this.add(x,y);
                break;            
            case "-":
                this.minus(x,y);
            case "*":
                this.multiply(x,y);
                break;
            case "/":
                this.divide(x,y);
        }
    }
    public void add(int x, int y){
        System.out.println("Not implemented");
    }
    public void minus(int x, int y){
        System.out.println("Not implemented");
    }
    public void multiply(int x, int y){
        System.out.println("Not implemented");
    }
    public void divide(int x, int y){
        System.out.println("Not implemented");
    }
}

class RealCalculator extends Base{
    public RealCalculator(int x, String op, int y){
        super(x,op,y);
    }
    public void add(int x, int y){
        System.out.println("Result = "+(x+y));
    }
    public void minus(int x, int y){
        System.out.println("Result = "+(x-y));
    }
    public void multiply(int x, int y){
        System.out.println("Result = "+(x*y));
    }
    public void devide(int x, int y){
        System.out.println("Result = "+(x/y));
    }
}
