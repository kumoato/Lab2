package F;

public class Calculate {
    // static method --> non create object
    static int sumAdd(int x, int y)
    {
        int z = x+y;
        return z;
    }

    public static void main(String[] args) {
        int numbers;
        numbers = sumAdd(30,20);
        System.out.println(numbers);
    }

}
