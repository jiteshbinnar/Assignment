package HybridInheritance;

    class A
    {    void show()
    {    System.out.println ("Iam in class a");
    }
    }
    class B extends A
    {    void show()
    {    System.out.println ("Iam in class B");
    }
    }
    interface C
    {    public void show1();
    }
    class D extends B implements C
    {    void show()
    {    System.out.println ("Iam using Class B in class D");
    }
        public void show1()
        {    System.out.println ("Iam using interface");
        }
    }
    class hybrid
    {    public static void main(String args[ ])
    {    A a=new A();a.show();
        B b=new B(); b.show();
        C c;
        D d=new D();d.show();
        c=new D();c.show1();
    }
}
