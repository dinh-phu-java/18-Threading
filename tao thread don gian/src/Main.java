public class Main {
    public static void main(String[] args) {
        NumberGenerator obj1= new NumberGenerator("One");
        NumberGenerator obj2= new NumberGenerator("Two");

        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

    }
}
