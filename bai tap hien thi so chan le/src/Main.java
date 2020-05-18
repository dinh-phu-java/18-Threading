public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1= new OddNumber();
        Thread t2=new EvenNumber();

        t1.start();
        t1.join();
        t2.start();
    }
}
