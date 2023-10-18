package processo;

public class FabricaVeiculos {
    public Fabrica createVehicle(String type) {
        if (type.equalsIgnoreCase("carro")) {
            return new Carro();
        } else if (type.equalsIgnoreCase("moto")) {
            return new Moto();
        } else {
            return null; // Pode retornar null ou lançar uma exceção se o tipo for desconhecido.
        }
    }
}
