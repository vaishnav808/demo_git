abstract class Vehical{

    public abstract void start();
    
}

public class Demo{

    public static void main(String [] args){
        Vehical v1 = new Vehical() {
            @Override
            public  void start(){
                System.out.println("Wrooommmmmmmmm.......");
            }
        };

        v1.start();
    }

}