import java.util.TreeMap;

public class test2 {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            System.out.println("start new thread");
        });
        t.start();
    }
}
