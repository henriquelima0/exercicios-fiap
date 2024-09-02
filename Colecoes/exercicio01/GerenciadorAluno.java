package exercicio01;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class GerenciadorAluno {
	List<Aluno> lista = new LinkedList<Aluno>();
	
	public void inserir(Aluno aluno) {
		lista.add(aluno);
	}
	
	public void imprimirOrdemAlfabetica() {
		Collections.sort(lista);
		for(Aluno a : lista) {
			System.out.println(a);
		}
	}
	
	public void imprimirPorIdade() {
		System.out.println();
		lista.sort(Comparator.comparingInt(Aluno::getIdade));
		for(Aluno a : lista) {
			System.out.println(a);
		}
	}
	
	public void imprimirPorMedia() {
		System.out.println();
		lista.sort(Comparator.comparingDouble(Aluno::getMedia).reversed());
		for(Aluno a : lista) {
			System.out.println(a);
		}
	}
}
