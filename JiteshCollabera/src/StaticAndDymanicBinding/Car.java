package StaticAndDymanicBinding;

public class Car extends Vehicle
{

//public void start() {

//    super.start();
//}

    public void start() {   // early binding
        System.out.println("car has been started");
    }
    public static void stop() { // late binding
        System.out.println("Car has been stopped");
    }
}
