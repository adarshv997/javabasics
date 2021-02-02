class mycalculation {
    int z;
     
    public void addition(int x, int y) {
       z = x + y;
       System.out.println("The sum of the given numbers:"+z);
    }
     
    public void Subtraction(int x, int y) {
       z = x - y;
       System.out.println("The difference between the given numbers:"+z);
    }
 }
 
 public class calculation extends mycalculation {
    public void multiplication(int x, int y) {
       z = x * y;
       System.out.println("The product of the given numbers:"+z);
    }
     
    public static void main(String args[]) {
       int a = 5, b = 10;
       calculation demo = new calculation();
       demo.addition(a, b);
       demo.Subtraction(a, b);
       demo.multiplication(a, b);
    }
 }