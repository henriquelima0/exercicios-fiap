import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private String driver = "oracle.jdbc.driver.OracleDriver";
    private String login = "rm99545";
    private String senha = "160205";
    private String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";

    public Connection Conectar(){
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, login, senha);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Erro ao carregar o driver: " + e);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar" + e);
        }
        return connection;
    }
}