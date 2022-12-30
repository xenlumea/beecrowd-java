import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Bee1003_SomaSimples {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int A, B, SOMA = 0;
        A = Integer.parseInt(reader.readLine());
        B = Integer.parseInt(reader.readLine());

        SOMA = A + B;

        String saida = String.format("SOMA = %d", SOMA);
        System.out.println(saida);
    }
}
