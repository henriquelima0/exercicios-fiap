package br.fiap.modelo.dao;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import br.fiap.modelo.bean.Perfil;
import br.fiap.modelo.conexao.ConnectionFactory;

public class PerfilDAO extends DAO{
	public PerfilDAO() {
		this.connection = ConnectionFactory.getInstance().getConnection();
	}
	
	public List<Perfil> listarPerfil(){
		List<Perfil> lista = new LinkedList<Perfil>();
		sql = "select * from java_perfil";
		try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id_perfil");
				String nome = rs.getString("nome");
				Perfil perfil = new Perfil();
				perfil.setIdPerfil(id);
				perfil.setPerfil(nome);
				lista.add(perfil);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
}
