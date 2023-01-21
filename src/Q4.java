interface AB
{
    void dosth();
}
class _A implements AB{
    @Override
    public void dosth() {
        System.out.println("Do laundaries");
    }
}
class _B implements AB{
    @Override
    public void dosth() {
        System.out.println("Sweep the floor");
    }
}
class _C
{
    AB ab;
    _C(AB a)
    {
        ab = a;
    }
    void call()
    {
        ab.dosth();
    }
}
public class Q4
{
    public static void main(String[] args) {
        _A a = new _A();
        _C c = new _C(a);
        c.call();


        _B b = new _B();
        _C c1 = new _C(b);
        c1.call();
    }
}
