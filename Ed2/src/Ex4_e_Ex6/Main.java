package Ex4_e_Ex6;

import java.util.List;

public class Main {

    public static void testaEx4() {
        List<Integer> listaCabos = List.of(1, 2, 3, 5, 11, 9, 4, 7);
        int distancia = 45;

        Cabos cabos = new Cabos(listaCabos);

        Integer valor = cabos.menorCustoDeConexao(distancia);

        System.out.println("O menor custo de conexão é: " + valor);
    }

    public static void testaEx6() {
        ListaCircularDuplamente lista = new ListaCircularDuplamente();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        lista.insere(4);
        lista.insere(5);
        lista.insere(6);
        lista.insere(7);
        System.out.println("valor na posicão tamanho/2 é: " + lista.noDOMeio());
    }

    public static void main(String[] args) {
        Main.testaEx4();
        Main.testaEx6();
    }
}