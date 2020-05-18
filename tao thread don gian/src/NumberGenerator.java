public class NumberGenerator implements Runnable {
    private String name;
    public NumberGenerator(String name){
        this.name=name;
    }
    @Override
    public void run(){
        for (int i=0;i<10;i++){
            try {
                System.out.println("The Name is: "+this.name+" Hash Code is "+this.hashCode() +" "+ i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
