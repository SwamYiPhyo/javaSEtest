abstract class Abstraction
{
    abstract void eat();
    static void sleep()
    {
        System.out.println("Sleeping");
    }
    void run()
    {
        System.out.println("Running");
    }

}
class Hi extends Abstraction
{
    @Override
    void eat() {
        System.out.println("He is eating");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Hi hi = new Hi();
        hi.eat();
        hi.run();
        Abstraction.sleep();
    }
}
