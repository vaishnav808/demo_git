abstract class Car{
    public abstract  void start();

    public abstract void stop();

}


class Audi extends Car{
    @Override
    public void start() {
        System.out.println("Audi is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Audi is stopping...");
    }
}










public class Demo {
    
    public static void main(String[] args) {
        
        Audi a1 = new Audi();

        a1.start();
        a1.stop();


    }

}
