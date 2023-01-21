interface  Swam
{
    int a = 8;
}
interface Yi
{
    int b = 9;
}
class Phyo implements Swam, Yi
{
    public static void main(String[] args) {
        Phyo obj = new Phyo();
        int c = Swam.a + Yi.b;
        System.out.println(c);
    }
}



public class Q3 {
    public static void main(String[] args) {

    }
}
