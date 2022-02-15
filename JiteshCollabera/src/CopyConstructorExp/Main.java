package CopyConstructorExp;

public class Main {
    public static void main(String[] args) {
        person a=new person(10);
        person b=new person(20);
        person  c=a;
        System.out.println("age is "+a.age+" "+b.age+" "+c.age);
        a.age=25;
        System.out.println("age is "+a.age+" "+b.age+" "+c.age);


    }
}
