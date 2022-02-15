package methodOverrding;

import methodOverrding.D;

public class Main1 {
    public static void main(String[] args) {
      D d=new D();     //create instance of child class
      d.bike();    //Override parent class method on line 4 and execute child class method on line 6
                   // ,because both child and
                  // parent class having same method.And priority given to child class method

      d.car();     //execute method of parent class on line 9
    }
}
