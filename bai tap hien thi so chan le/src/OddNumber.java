public class OddNumber extends Thread {

    @Override
    public void run(){
        for (int i=1;i<20;i+=2){
            System.out.println("Odd Number: "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
