import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Bee1002_AreaDoCirculo {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double A, raio;
        final double PI = 3.14159;

        raio = Double.parseDouble(reader.readLine());

        A = PI * Math.pow(raio, 2);

        String saida = String.format("A=%.4f", A);
        System.out.println(saida);

    }
}
