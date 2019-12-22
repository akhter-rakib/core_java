package abstract_pro;

public abstract class Bike {
    Bike() {
        System.out.println("This is contructor only");
    }

    public void run() {
        System.out.println("It can be body here");
    }

    public abstract void add(int a, int b);

    public final void finalMethod() {
        System.out.println("THis is not changeable from the implemented class");
    }

    public static void staticMethod() {
        System.out.println("Static Method");
    }
}
