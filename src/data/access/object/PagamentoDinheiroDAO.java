package data.access.object;

import beans.pagamento_dinheiro;
import conexaobanco.ConexaoComMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import beans.pagamento_dinheiro;

/**
 *
 * @author Camila <Camila.Serrao>
 */

//classe Data Acess Object. Criar uma classe DOA para cada classe bean.
//Exemplo com classe Categoria.

public class PagamentoDinheiroDAO {
    private Connection conexao=null;

    public PagamentoDinheiroDAO() {
    conexao = ConexaoComMySQL.getConexaoMySQL();
    }
    
    //inserir
    public boolean insert(pagamento_dinheiro pagaDinheiro){ 
        String sql = "INSERT INTO  Pedido (data, hora, qtd, nome_produto) VALUES (?,?,?,?)";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
        statement.setDouble(2, pagaDinheiro.getPreco());
        statement.setDouble(3, pagaDinheiro.getQtd_do_dinheiro());
        statement.setDouble(4, pagaDinheiro.getTroco());
        statement.executeUpdate();
        return true;
    }catch (SQLException e){
            System.out.println("erro: "+e);
            return false;
    }finally{
            //fechar conexao
            ConexaoComMySQL.FecharConexao();
        }
    }
    
    //SELECT
    public List<pagamento_dinheiro> select(){ 
         String sql = "SELECT * FROM categoria";
         PreparedStatement statement = null;
         ResultSet resultset = null;
         List<pagamento_dinheiro> pagardinheiro = new ArrayList<>();
         try{
             statement = conexao.prepareStatement(sql);
             resultset = statement.executeQuery();
             while(resultset.next()){
                pagamento_dinheiro pagarDinheiro = new pagamento_dinheiro();
                pagarDinheiro.setPreco(resultset.getDouble("preco"));
                pagarDinheiro.setQtd_do_dinheiro(resultset.getDouble("qtd dinheiro do cliente"));
                pagarDinheiro.setTroco(resultset.getDouble("troco"));
                pagarDinheiro.add(pagarDinheiro);
             }
         }catch(SQLException e ){
             System.out.println("erro "+e);
         }
         finally{
             ConexaoComMySQL.FecharConexao();
         }
         return pagardinheiro;
    }
    
    //UPDATE
    public boolean update (pagamento_dinheiro pagaDinheiro){ 
        String sql = "UPDATE categoria SET descricao = ? WHERE id= ?";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
        statement.setDouble(2, pagaDinheiro.getPreco());
        statement.setDouble(3, pagaDinheiro.getQtd_do_dinheiro());
        statement.setDouble(4, pagaDinheiro.getTroco());
        statement.executeUpdate();
        return true;
    }catch (SQLException e){
            System.out.println("erro: "+e);
            return false;
    }finally{
            //fechar conexao
            ConexaoComMySQL.FecharConexao();
        }
    }
    
    //DELETE
    public boolean delete (pagamento_dinheiro pagaDinheiro){
        String sql = "DELETE FROM categoria WHERE id = ?";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
        statement.setDouble(2, pagaDinheiro.getPreco());
        statement.setDouble(3, pagaDinheiro.getQtd_do_dinheiro());
        statement.setDouble(4, pagaDinheiro.getTroco());
        statement.executeUpdate();
        return true;
    }catch (SQLException e){
            System.out.println("erro: "+e);
            return false;
    }finally{
            //fechar conexao
            ConexaoComMySQL.FecharConexao();
        }
    }
}


