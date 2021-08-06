package C;

public class Method {
    private String name = "Corolla";
    private String model = "2020";
    private String color = "Ash";
    private int tyres = 4;

    void method1()
    {
        System.out.println("This delivers content of Method1.");
    }
    void method2()
    {
        System.out.println("This delivers content of Method2.");
    }
    void method3()
    {
        System.out.println("This delivers content of Method3.");
    }

    public static void main(String[] args)
    {
        Method mainMethod = new Method();
        mainMethod.method1();
        mainMethod.method2();
        mainMethod.method3();
    }

}
