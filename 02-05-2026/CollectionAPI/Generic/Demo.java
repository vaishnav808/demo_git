class Calculation <T extends Number> {
    T a;
    T b;

    public Calculation (T a, T b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        return (a.doubleValue()+ b.doubleValue());
    }

}




public class Demo {
    public static void main(String[] args) {
        Calculation<Integer> calc1 = new Calculation<>(5, 10);
        System.out.println(calc1.add());

        Calculation<Double> calc2 = new Calculation<>(5.5, 10.5);
        System.out.println(calc2.add());

        List <? extends Number> nums = new ArrayList<>();
        nums.add(null);
        // nums.add(10); --- IGNORE ---
        // nums.add(10.5); --- IGNORE ---           
    }
}
