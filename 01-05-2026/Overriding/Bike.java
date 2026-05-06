public class Bike extends Vehical {
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bike{");
        sb.append('}');
        return sb.toString();
    }
}
