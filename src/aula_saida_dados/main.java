package aula_saida_dados;
import java.util.Locale;

public class main {
    public static void main(String[] args) {

        calculo  n = new calculo();

        DadosCliente cliente = new DadosCliente();
        n.setX(10.97986);

        System.out.println(n.getX());
        System.out.printf("%.4f%n" , n.getX());
        n.setX(9.98733645871);
        Locale.setDefault(Locale.US);
        System.out.printf("%.3f\n" , n.getX());
        System.out.printf("Resultado = %.2f metros quadrados\n" , n.getX());

        cliente.setNome("Rita");
        cliente.setIdade(45);
        cliente.setRenda(4000.00);

        System.out.printf("%s tem %d anos e ganha R$%.2f reais por mês",cliente.getNome(),
                cliente.getIdade(), cliente.getRenda() );
    }
}
