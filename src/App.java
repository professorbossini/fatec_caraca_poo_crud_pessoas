import javax.swing.JOptionPane;



//import java.sql.Connection;

public class App {
    public static void main(String[] args) throws Exception {


        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
        int op = -1;
        do{
            try{
                op = Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch (op) {
                    case 1:{
                        String nome = JOptionPane.showInputDialog("Qual o nome?");
                        String fone = JOptionPane.showInputDialog("Qual o fone?");
                        String email = JOptionPane.showInputDialog("Qual o email");
                        Pessoa p = new Pessoa(nome, fone, email);
                        p.inserir();
                        JOptionPane.showMessageDialog(null, "Beleza, inseriu!");
                    }
                        break;
                    case 2:{
                        String nome;
                    }
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    default:
                        break;
                }
            }
            catch (NumberFormatException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Você precisa digitar um número");
            }
            

        }while (op != 0);
       
       
       
       
        /*Connection conn = ConnectionFactory.obterConexao();
       if (conn != null){
        System.out.println("Beleza, deu certo");
       }
       else{
        System.out.println("Falhou");
       }*/

    }
}
