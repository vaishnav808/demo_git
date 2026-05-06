
@FunctionalInterface
interface A {
    void show();
}


class B implements A{
    @Override
    public void show() {
        System.out.println("Hello from B");
    }
}




public class Demo {

    public static void main(String[] args) {
        A demo = new B();
        demo.show();
    }
}