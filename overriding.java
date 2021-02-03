class animal {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Cat extends animal {
   public void move() {
      System.out.println("Cats can walk and run");
   }
}

public class overriding {

   public static void main(String args[]) {
      animal a = new animal();   
      animal b = new Cat();  
      a.move();   
      b.move();
   }
}