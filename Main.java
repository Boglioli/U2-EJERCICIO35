import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<EstrategiaEnvio> envios = new ArrayList<>();
            envios.add(new EnvioEstandar(1000));
            envios.add(new EnvioExpresoAereo(2000));
            envios.add(new EnvioMaritimo(1500));
            double pesokg = 10;
            double distanciakm = 100;
            for (EstrategiaEnvio envio : envios) {
                double costo = envio.calcularCosto(pesokg, distanciakm);
                if (costo >= 0) {
                    System.out.println("costo del envio: $ " + costo);
                }
                System.out.println("------------------------");
            }
    }
}