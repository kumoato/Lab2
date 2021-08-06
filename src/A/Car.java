package A;

public class Car {
    private String name = "Corolla";
    private String model = "2020";
    private String color = "Ash";
    private int tyres =4;

    public static void main(String[] args) {
        Car Toyota = new Car();
        System.out.println("Name is"+Toyota.name);
        System.out.println(Toyota.model);
        System.out.println(Toyota.color);
        System.out.println(Toyota.tyres);
    }
}
