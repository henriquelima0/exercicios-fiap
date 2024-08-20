package fiap.venda.modelo;

import java.time.LocalDate;

public class Venda {
	private int id_venda;
	private Vendedor vendedor;
	private double total;
	private LocalDate data;
	
	public Venda(int id_venda, Vendedor vendedor, double total, LocalDate data) {
		super();
		this.id_venda = id_venda;
		this.vendedor = vendedor;
		this.total = total;
		this.data = data;
	}

	public int getId_venda() {
		return id_venda;
	}

	public void setId_venda(int id_venda) {
		this.id_venda = id_venda;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}	
}
