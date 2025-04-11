import java.sql.*;
import java.util.Scanner;
public class DeletarMySQL {
    public static void main(String[] args) {
        // URL de conexão com o banco (ajuste o nome do banco)
        String url = "jdbc:mysql://localhost:3306/usuarios?useSSL=false&serverTimezone=UTC";
        String usuario = "root"; // ex: root
        String senha = "Coelho34757741";     // ex: 1234

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Qual o Id que deseja excluir ?");
            int idScanner = scanner.nextInt();


            // Estabelece a conexão
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            String sql = "DELETE FROM usuarios WHERE id = (?)" ;
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idScanner);

            int linhasAfetadas = stmt.executeUpdate();
            System.out.println("Deletamento concluído! " + linhasAfetadas + " linha(s) adicionada(s).");


            System.out.println("Excluido!");
            // Fecha a conexão
            conexao.close();
        } catch (SQLException e) {
            System.out.println("❌ Erro ao conectar ao MySQL: " + e.getMessage());
        }
    }
}
