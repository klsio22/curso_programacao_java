package aula_saida_dados;
import java.util.Locale;

public class main {
    public static void main(String[] args) {

        calculo  n = new calculo();


        n.setX(10.97986);

        System.out.println(n.getX());
        System.out.printf("%.4f%n" , n.getX());
        n.setX(9.98733645871);
        Locale.setDefault(Locale.US);
        System.out.printf("%.3f\n" , n.getX());
        System.out.printf("Resultado = %.2f metros quadrados\n" , n.getX());

    }
}
