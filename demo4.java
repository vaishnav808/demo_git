interface  A {
  default  void show (){
        System.out.println("Interface A");
    }
}


interface B {
    default void show (){
        System.out.println("Interface B");
    }
}

public class demo4 implements A, B {
    @Override
    public void show() { // resolving method conflict by providing a specific implementation
        System.out.println("Resolving method conflict in demo4");
    }

    public static void main(String[] args) {
        demo4 obj = new demo4();
        obj.show(); // calling the show method of demo4
    }
}
