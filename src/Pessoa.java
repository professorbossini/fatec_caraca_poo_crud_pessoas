import java.sql.Connection;
import java.sql.PreparedStatement;

public class Pessoa {
  private int codigo;
  private String nome;
  private String fone;
  private String email;

  public Pessoa (String nome, String fone, String email){
    this.nome = nome;
    this.fone = fone;
    this.email = email;
  }

  public void atualizar (){
    
  }


  public void inserir (){
    //1. Definir o comando SQL
    String sql = "INSERT INTO tb_pessoa (nome, fone, email) VALUES (?, ?, ?);";
    //2. Abrir uma conexão com o banco
    Connection conexao = null;
    try{
      conexao = ConnectionFactory.obterConexao();
      //3. Pré compilar o comando
      PreparedStatement ps = conexao.prepareStatement(sql);
      //4. Configurar os valores
      ps.setString(1, nome);
      ps.setString(2, fone);
      ps.setString(3, email);
      //5. executar
      ps.execute();
      conexao.close();
    }
    catch (Exception e){
       e.printStackTrace();
      try{
        if (conexao != null)
          conexao.close();
      }
      catch (Exception ex){
        ex.printStackTrace();
      }
           
    }

  }
}
