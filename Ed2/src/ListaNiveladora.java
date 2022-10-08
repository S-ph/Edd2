import java.util.ArrayList;
import java.util.List;

public class ListaNiveladora {
    public static void main(String[] args) {
        testarQ1();
        testarQ8();

    }

    public static void testarQ8() {
        List<Integer> lotesDesorganizados = new ArrayList<Integer>();
        lotesDesorganizados.add(35);
        lotesDesorganizados.add(33);
        lotesDesorganizados.add(42);
        lotesDesorganizados.add(10);
        lotesDesorganizados.add(14);
        lotesDesorganizados.add(19);
        lotesDesorganizados.add(27);
        lotesDesorganizados.add(44);
        lotesDesorganizados.add(26);
        lotesDesorganizados.add(31);
        Questao8.organizarLotes(lotesDesorganizados);

        System.out.println("Resposta Questão 8: " + lotesDesorganizados);
    }

    public static void testarQ1() {
        List<Integer> listaInicial = new ArrayList<>();
        listaInicial.add(1);
        listaInicial.add(7);
        listaInicial.add(2);
        listaInicial.add(9);
        System.out.println("Resposta da Questão 1: " + Questao1.gerarSequencia(listaInicial));
    }
}
