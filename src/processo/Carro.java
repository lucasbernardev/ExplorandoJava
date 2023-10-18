package processo;

public class Carro implements Fabrica {
    @Override
    public void build() {
        System.out.println("Construindo um carro.");
    }
}