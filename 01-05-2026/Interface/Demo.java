interface A {
    default void show(){
        System.out.println("Hello from A");
    }
}

interface B  extends A{
    default void show(){
        System.out.println("Hello from B");
    }
}

public class Demo implements A, B {

    @Override
    public void show() {
        A.super.show();
    }
    public static void main(String[] args) {
        B demo = new Demo();
        demo.show();
    }
}