public class EnvioEstandar extends EstrategiaEnvio{
    public EnvioEstandar() {
        this(1000);
    }

    public EnvioEstandar(double tarifaBase) {
        super(tarifaBase);
    }

    @Override
    public double calcularCosto(double pesokg, double distanciakm) {
        if (pesokg < 0 || distanciakm < 0) {
            throw new IllegalArgumentException("peso o distancia invalidos");
        }
        return tarifaBase + pesokg * 100 + distanciakm * 10;
    }
}
