package arvores;

public class ABBINT {

	private class ARVORE {
		int dado;
		ARVORE esq;
		ARVORE dir;
	}

	public ARVORE root = null;

	public ARVORE inserir(ARVORE p, int info) {
		// insere elemento em uma ABB
		if (p == null) {
			p = new ARVORE();
			p.dado = info;
			p.esq = null;
			p.dir = null;
		} else if (info < p.dado)
			p.esq = inserir(p.esq, info);
		else
			p.dir = inserir(p.dir, info);
		return p;
	}
	public void show(ARVORE p) {
		if (p!=null) {
			show(p.esq);
			System.out.print("\t" + p.dado);
			show(p.dir);
		}
		
	}
	public int contaNos(ARVORE p,int cont) {
		if (p!=null) {
			cont++;
			cont = contaNos(p.esq, cont);
			cont = contaNos(p.dir, cont);
		}
		return cont;
	}

	public boolean consulta(ARVORE p, int valor){
		if(p != null){ // Se nó não for nulo
			if(valor == p.dado){ // Se nó for igual ao dado procurado
				return true;
			} else if(valor < p.dado){
				return consulta(p.esq, valor);
			} else{
				return consulta(p.dir, valor);
			}
		}
		return false;
	}
}
