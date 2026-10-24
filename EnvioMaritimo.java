public class EnvioMaritimo extends EstrategiaEnvio {
    public EnvioMaritimo() {
        this(1500);
    }

    public EnvioMaritimo(double tarifaBase) {
        super(tarifaBase);
    }

    @Override
    public double calcularCosto(double pesokg, double distanciakm) {
        if (pesokg < 0 || distanciakm < 0) {
            throw new IllegalArgumentException("peso o distancia invalidos");
        }
        return tarifaBase + pesokg * 50 + distanciakm * 5;
    }
}
