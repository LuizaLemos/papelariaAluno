package data.access.object;

import conexaobanco.ConexaoComMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import beans.Pedido;

/**
 *
 * @author Camila <Camila.Serrao>
 */

//classe Data Acess Object. Criar uma classe DOA para cada classe bean.
//Exemplo com classe Categoria.

public class PedidoDAO {
    private Connection conexao=null;

    public PedidoDAO() {
    conexao = ConexaoComMySQL.getConexaoMySQL();
    }
    
    //inserir
    public boolean insert(Pedido pedido){ 
        String sql = "INSERT INTO  Pedido (cod_pedido) VALUES (?)";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
        statement.setInt(1, pedido.getPedido());
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
    public List<Pedido> select(){ 
         String sql = "SELECT * FROM categoria";
         PreparedStatement statement = null;
         ResultSet resultset = null;
         List<Pedido> categorias = new ArrayList<>();
         try{
             statement = conexao.prepareStatement(sql);
             resultset = statement.executeQuery();
             while(resultset.next()){
                 Pedido pedido = new Pedido();
                 pedido.setDescricao(resultset.getString("descricao"));
                 categorias.add(categoria);
             }
         }catch(SQLException e ){
             System.out.println("erro "+e);
         }
         finally{
             ConexaoComMySQL.FecharConexao();
         }
         return categorias;
    }
    
    //UPDATE
    public boolean update (Categoria categoria){ 
        String sql = "UPDATE categoria SET descricao = ? WHERE id= ?";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
        statement.setString(1, categoria.getDescricao());
        statement.setInt(2, categoria.getId());
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
    public boolean delete (Categoria categoria){
        String sql = "DELETE FROM categoria WHERE id = ?";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
        statement.setInt(1, categoria.getId());
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
