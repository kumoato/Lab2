package D;

public class ClassRun {
    public static void main(String[] args) {
        Ball myBall = new Ball();
        Ball secondBall = new Ball();

        myBall.name = "Second ball";
        myBall.color = "Brown";

        secondBall.name = "Basketball";
        secondBall.color = "Blue";

        System.out.println(myBall.name);
        System.out.println(myBall.color);
        myBall.deflate();
        System.out.println("-----------");
        System.out.println(secondBall.name);
        System.out.println(secondBall.color);
        secondBall.inflates();
    }
}
