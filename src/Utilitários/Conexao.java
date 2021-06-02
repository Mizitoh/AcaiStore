package Utilitários;

import java.sql.*;
import javax.swing.*;




/**
 *
 * @author Mike
 */
public class Conexao {
    
    final private String driver = "org.firebirdsql.jdbc.FBDriver";
    final private String url = "jdbc:firebirdsql:localhost/3050:C:/acailandia/Banco de dados/ACAI.FDB";
    final private String usuario = "SYSDBA";
    final private String senha = "masterkey";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    public String id; //deixei como public por preguiça  
    public String nome; //mas deixe private e faça getter/setter  

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
  
   private void Item(String id,String nome){  
       this.id = id;  
       this.nome = nome;  
   }  
  
  
   @Override  
   public String toString(){  
     return nome; //o que vai aparecer na comboBox  
    }  
  
    public boolean Conecta() throws SQLException {
        boolean result = true;
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectou");
        } catch (ClassNotFoundException Driver) {
            JOptionPane.showMessageDialog(null, "Driver não localizado: " + Driver);
            result = false;
        }
        return result;
    }
    public void ExecuteSQL(String sql) {
        try {
            
            statement = conexao.createStatement();
            resultset = statement.executeQuery(sql);
                        
            }  catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel executar o comando sql, "
                    + sqlex + ", o sql passado foi " + sql);
        }
    }

    public void Desconecta() {
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null, "Fechando o Banco de dados, você está saindo do Sistema. \n Bom descanso!");
        } catch (SQLException fecha) {
            JOptionPane.showMessageDialog(null, "Não foi possivel " + fecha);
        }
    }

    public static void main(String args[]) {
                
    }
}

/*while (resultSet.next()) {
                                
                                System.out.println("entrei no while "+j+'x');
                                
                                String label = "["+j+"]=>[";
                                for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
                                        label+=("["+resultSet.getMetaData().getColumnName(i)+"] => "+ resultSet.getString(resultSet.getMetaData().getColumnName(i))+" ");
                                }
                                label+= "]";
                                System.out.println(label);
                                j++;
                        }*/