package abstract_pro;

public class Honda extends Bike {
    @Override
    public void add(int a, int b) {
        System.out.println("The Addition is " + a + b);
    }

    public static void main(String[] args) {
        Bike.staticMethod();
        Bike bike = new Honda();
        bike.add(12, 3);

    }
}
