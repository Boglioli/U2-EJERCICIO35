public abstract class EstrategiaEnvio {
    protected double tarifaBase;
    public EstrategiaEnvio(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }
    public abstract double calcularCosto(double pesokg, double distanciakm);
}
