package exercicio03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciadorProduto {
	private Map<String, List<Produto>> lista = new HashMap<String, List<Produto>>();
	
	public void inserir(Produto produto) {
		List<Produto> produtos = lista.computeIfAbsent(produto.getCategoria(), k -> new ArrayList<>());
		produtos.add(produto);
	}
	public void imprimir(String categoria){
		List<Produto> listaProduto = lista.get(categoria);
		listaProduto.forEach(produto -> {
			System.out.println(produto);
		});
	}
}
