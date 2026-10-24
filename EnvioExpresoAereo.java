public class EnvioExpresoAereo extends EstrategiaEnvio{
    public EnvioExpresoAereo() {
        this(2500);
    }

    public EnvioExpresoAereo(double tarifaBase) {
        super(tarifaBase);
    }

    @Override
    public double calcularCosto(double pesokg, double distanciakm) {
        if (pesokg < 0 || distanciakm < 0) {
            throw new IllegalArgumentException("peso o distancia invalidos");
        }
        return tarifaBase + pesokg * 300 + distanciakm * 25;
    }
}
