public class methodoverloading {
    static int plusMethod(int x, int y) {
      return x + y;
    }
    
    static double plusMethod(double x, double y) {
      return x + y;
    }
    
    public static void main(String[] args) {
      int myNum1 = plusMethod(2, 3);
      double myNum2 = plusMethod(2.63, 5.92);
      System.out.println("int: " + myNum1);
      System.out.println("double: " + myNum2);
    }
  }
  