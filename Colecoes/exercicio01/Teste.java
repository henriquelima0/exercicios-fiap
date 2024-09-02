package exercicio01;

import exercicio03.GerenciadorProduto;
import exercicio03.Produto;

public class Teste {
    public static void main(String[] args) {

        GerenciadorProduto gerenciador = new GerenciadorProduto();
        gerenciador.inserir(new Produto("veja", "limpeza"));
        gerenciador.inserir(new Produto("arroz", "alimento"));
        gerenciador.inserir(new Produto("detergente", "limpeza"));
        gerenciador.inserir(new Produto("batata", "alimento"));

        gerenciador.imprimir("alimento");

    }
}
