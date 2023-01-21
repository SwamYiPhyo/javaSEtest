class A
{
    void eat()
    {
        System.out.println("I'm eating");
    }
}
class B extends A
{
    void sleep()
    {
        System.out.println("I'm sleeping");
    }
}
class C extends B
{
    void drink()
    {
        System.out.println("I'm drinking");
    }
}

public class Q1 {
    public static void main(String[] args) {
       C c = new C();
       c.drink();
       c.eat();
       c.sleep();
    }
}