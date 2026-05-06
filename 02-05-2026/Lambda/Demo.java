interface A {
    int add (int i, int j);
}



public class Demo {
    public static void main(String[] args) {
        A demo = (int i, int j) -> {
                return i+j;
            };

        System.err.println(demo.add(5,5));
    }
}
