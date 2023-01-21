class Thread implements Runnable
{
    @Override
    public void run() {
        System.out.println("Kyan naw pyay ny ya b");
    }
}


public class Q7 {
    public static void main(String[] args) {
        Thread a = new Thread();
        a.run();
    }
}
