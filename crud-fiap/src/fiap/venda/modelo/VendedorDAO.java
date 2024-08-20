package fiap.venda.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fiap.venda.conexao.ConnectionFactory;

public class VendedorDAO {
	private Connection connection;
	private String sql;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public void inserir(Vendedor vendedor) {
		connection = ConnectionFactory.getInstance().getConnection();
		sql = "insert into java_vendedor values (?, ?)";
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, vendedor.getId_vendedor());
			ps.setObject(2, vendedor.getNome());
			ps.execute();
		} catch (SQLException e) {
			System.out.println("Erro ao inserir vendedor\n" + e);
		}		
	}
	
	// método para pesquisar o vendedor pelo ID
	public Vendedor pesquisarId(int id) {
		Vendedor vendedor = null;
		connection = ConnectionFactory.getInstance().getConnection();
		sql = "select * from java_vendedor where id_vendedor = ?";
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				vendedor = new Vendedor(id, rs.getString("nome"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vendedor;
	}

	// Métodos para listar todos os vendedores
	public List<Vendedor> listar(){
		List<Vendedor> lista = new ArrayList<Vendedor>();
		Vendedor vendedor;
		connection = ConnectionFactory.getInstance().getConnection();
		sql = "select * from java_vendedor";
        try {
            ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			// Enquanto RS = true
			while(rs.next()){
				vendedor = new Vendedor(rs.getInt("id_vendedor"), rs.getString("nome_vendedor"));
				lista.add(vendedor);
			}
        } catch (SQLException e) {
			System.out.println("Erro ao listar os vendedores: " + e);
        }
        return lista;
	}
	
}
