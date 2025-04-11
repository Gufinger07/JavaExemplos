import java.sql.*;

public class ListarMySQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/usuarios?useSSL=false&serverTimezone=UTC";
        String usuario = "root"; // ex: root
        String senha = "Coelho34757741";     // ex: 1234

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            // Query SQL
            String sql = "SELECT * FROM usuarios";

            // Cria a declaração preparada
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // Executa a query e armazena o resultado
            ResultSet resultado = stmt.executeQuery();

            // Itera sobre os resultados
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                String email = resultado.getString("email");

                System.out.println("ID: " + id + " | Nome: " + nome + " | Email: " + email);
            }

            // Fecha tudo
            resultado.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Erro ao consultar: " + e.getMessage());
        }
    }
}