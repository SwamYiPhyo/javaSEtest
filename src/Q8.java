interface Mingalar
{
    void add(int a, int b);
}


public class Q8 {
    public static void main(String[] args) {
        Mingalar obj = (a,b)->{
            System.out.println(a+b);
        };
       obj.add(2,3);


    }
}
