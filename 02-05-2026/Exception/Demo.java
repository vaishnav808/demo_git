public class Demo {

    public static void main(String[] args) {
        
    
    int i =0;
    int j=0;
    int k[] = new int[5];

    try{
        // j = 18/0;
        System.out.println(k[5]);

    }catch(ArithmeticException e){
        System.err.println("Somthing is wrong......"+e);
    }catch(ArrayIndexOutOfBoundsException e){
        System.err.println("somthing wrong with array"+e);
    }

    System.out.println("Dmeo dmeod mdeo");
}
}
