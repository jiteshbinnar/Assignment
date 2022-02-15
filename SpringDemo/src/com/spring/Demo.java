package com.spring;

public class Demo {

    public int a;
    public int b;
    public Demo(double a, double b) {
        System.out.println("i am in double");
        this.a=(int) a;
        this.b=(int) b;
    }
    public Demo(int a, int b) {
        System.out.println("i am in int");
        this.a = a;
        this.b = b;
    }
    public Demo(String a, String b) {
        System.out.println("i am in String");
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
    }



    public void sum()
  {
      System.out.println("sum is "+(a+b));

  }
}
