import java.sql.*;
import java.util.Scanner;
public class UpdateMySQL {
    public static void main(String[] args) {
        // URL de conexão com o banco (ajuste o nome do banco)
        String url = "jdbc:mysql://localhost:3306/usuarios?useSSL=false&serverTimezone=UTC";
        String usuario = "root"; // ex: root
        String senha = "Coelho34757741";     // ex: 1234

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Qual o Id que deseja alterar ?");
            int idScanner = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Novo email ?");
            String emailScanner = scanner.nextLine();


            // Estabelece a conexão
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            String sql = "UPDATE usuarios SET email = ? WHERE id = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, emailScanner);
            stmt.setInt(2, idScanner);

            int linhasAfetadas = stmt.executeUpdate();
            System.out.println("Alteração concluída concluído! " + linhasAfetadas + " linha(s) adicionada(s).");


            System.out.println("Alterado!");
            // Fecha a conexão
            conexao.close();
        } catch (SQLException e) {
            System.out.println("❌ Erro ao conectar ao MySQL: " + e.getMessage());
        }
    }
}

