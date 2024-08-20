package fiap.venda.conexao;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import fiap.venda.modelo.VendaDAO;
import fiap.venda.modelo.Venda;
import fiap.venda.modelo.Vendedor;
import fiap.venda.modelo.VendedorDAO;

public class Teste {
	public static void main(String[] args) {
		VendedorDAO vendedorDAO = new VendedorDAO();
		Vendedor vendedor;

		VendaDAO vendaDAO = new VendaDAO();
		Venda venda;

		/* vendedor = new Vendedor(1, "Patrícia");
		vendedorDAO.inserir(vendedor);

		vendedor = new Vendedor(2, "Selmini");
		vendedorDAO.inserir(vendedor);

		vendedor = new Vendedor(3, "Francisco");
		vendedorDAO.inserir(vendedor); */

		// --- Busca por id
		// Vendedor vendedor = vendedorDAO.pesquisarId(3);
		// System.out.println(vendedor);


		/* -- Inserção tabela venda --
		String dataString = "19/08/2024";
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data = LocalDate.parse(dataString, formato);

		venda = new Venda(1, new Vendedor(1),1000, data);
		vendaDAO.inserir(venda);

		venda = new Venda(2, new Vendedor(1),2000, data);
		vendaDAO.inserir(venda);

		venda = new Venda(3, new Vendedor(1), 500, data);
		vendaDAO.inserir(venda);

		venda = new Venda(4, new Vendedor(2), 999, data);
		vendaDAO.inserir(venda); */

		/* --- Listagem dos vendedores
		List<Vendedor> listaVendedor = vendedorDAO.listar();
		for (Vendedor vend : listaVendedor) {
			System.out.println(vend);
		} */
	}
}
