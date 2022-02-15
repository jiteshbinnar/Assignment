package ModifiersDemo;

public class Main {
        public static void main(String[] args)
        {
                A a=new A();
                a.x=10;//Access within project
                //a.y=20;  .......private modifiers scope is only within class...
                a.z=30; //Access within Package
                a.q=40;//Access within Package,but by importing package we can access outside package
                System.out.println(a.x+" "+a.z+" "+a.q);
        }

        }
