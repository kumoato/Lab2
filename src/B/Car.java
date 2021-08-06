package B;

public class Car {
    private String name = "Corolla";
    private String model = "2020";
    private String color = "Ash";
    private int tyres = 4;

    void engine()
    {
        System.out.println("The car engine is very power");
    }
    void interior()
    {
        System.out.println("The car contains the seats, steering, dashboard...");
    }
    void exterior()
    {
        System.out.println("The car exterior is made up of the color, the tyres...");
    }
    public static void main(String[] args)
    {
        Car motor = new Car();
        motor.engine();
        motor.interior();
        motor.exterior();
    }

}
