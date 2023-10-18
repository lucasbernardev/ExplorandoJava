package processo;

public class Main {
    public static void main(String[] args) {
        FabricaVeiculos factory = new FabricaVeiculos();

        Fabrica carro = factory.createVehicle("carro");
        carro.build();

        Fabrica moto = factory.createVehicle("moto");
        moto.build();
    }
}
