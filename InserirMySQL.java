import java.sql.*;
import java.util.Scanner;
public class InserirMySQL {
    public static void main(String[] args) {
        // URL de conexão com o banco (ajuste o nome do banco)
        String url = "jdbc:mysql://localhost:3306/usuarios?useSSL=false&serverTimezone=UTC";
        String usuario = "root"; // ex: root
        String senha = "Coelho34757741";     // ex: 1234

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Qual o Nome ?");
            String nomeScanner = scanner.nextLine();
            System.out.println("Qual é o email ?");
            String emailScanner = scanner.nextLine();

            // Estabelece a conexão
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            String sql = "INSERT INTO usuarios (nome, email) values (?,?)" ;
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nomeScanner);
            stmt.setString(2, emailScanner);
            int linhasAfetadas = stmt.executeUpdate();
            System.out.println("Inserção concluída! " + linhasAfetadas + " linha(s) adicionada(s).");


            System.out.println("Adicionado!");
            // Fecha a conexão
            conexao.close();
        } catch (SQLException e) {
            System.out.println("❌ Erro ao conectar ao MySQL: " + e.getMessage());
        }
    }
}
