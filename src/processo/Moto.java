package processo;

public class Moto implements Fabrica {
    @Override
    public void build() {
        System.out.println("Construindo uma moto.");
    }
}