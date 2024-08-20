package fiap.venda.modelo;

import fiap.venda.conexao.ConnectionFactory;

import javax.xml.stream.util.XMLEventAllocator;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VendaDAO {
    private Connection connection;
    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;

    // MÉTODO PARA INSERIR UMA VENDA NO BANCO DE DADOS
    public void inserir(Venda venda){
        connection = ConnectionFactory.getInstance().getConnection();
        sql = "insert into java_venda values (?, ?, ?, ?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, venda.getId_venda());
            ps.setInt(2, venda.getVendedor().getId_vendedor());
            ps.setDouble(3, venda.getTotal());
            ps.setDate(4, Date.valueOf(venda.getData()));
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir vendedor\n" + e);
        }
    }
    public List<Venda> listarTotal(){
        List<Venda> lista = new ArrayList<>();
        connection = ConnectionFactory.getInstance().getConnection();
        sql = "SELECT vo.nome_vendedor, COALESCE(SUM(va.total), 0) AS total_venda " +
                "FROM java_vendedor vo " +
                "LEFT JOIN java_venda va " +
                "ON vo.id_vendedor = va.id_vendedor " +
                "GROUP BY vo.nome_vendedor";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery(); // só para select
        } catch (SQLException e) {
            System.out.println("Erro ao listar vendedor total de venda\n" + e);
        }
        return lista;
    }
}
