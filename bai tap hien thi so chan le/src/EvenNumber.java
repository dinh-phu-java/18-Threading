public class EvenNumber  extends Thread{


        @Override
        public void run(){
            for (int i=0;i<20;i+=2){
                System.out.println("Even Number: "+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
}

