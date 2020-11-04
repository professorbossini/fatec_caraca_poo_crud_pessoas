import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
  private static String usuario = "rodrigo";
  private static String senha = "1234";
  private static String host = "localhost";
  private static String porta = "3306";
  private static String db = "fatec_caraca_db_pessoas"; 
  
  
  public static Connection obterConexao () {
    try{
      Connection conexao = DriverManager.getConnection(
          // jdbc:mysql://localhost:3306/fatec_caraca_db_pessoas
          String.format("jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC", host, porta, db), 
          usuario, 
          senha
      );
      return conexao;
    }
    catch (Exception e){
      e.printStackTrace();
      return null;

    }   
  }
}
