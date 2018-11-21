package data.access.object;

import beans.Itens_pedido;
import conexaobanco.ConexaoComMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import beans.Itens_pedido;

/**
 *
 * @author Camila <Camila.Serrao>
 */

//classe Data Acess Object. Criar uma classe DOA para cada classe bean.
//Exemplo com classe Categoria.

public class Itens_pedidoDAO {
    private Connection conexao=null;

    public Itens_pedidoDAO() {
    conexao = ConexaoComMySQL.getConexaoMySQL();
    }
    
    //inserir
    public boolean insert(Itens_pedido itemPedido){ 
        String sql = "INSERT INTO  Pedido (data, hora, qtd, nome_produto) VALUES (?,?,?,?)";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
        statement.setString(1, itemPedido.getData());
        statement.setString(1, itemPedido.getHora());
        statement.setInt(1, itemPedido.getQtd_pro());
        statement.setString(1, itemPedido.getNome_produto());
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
    public List<Itens_pedido> select(){ 
         String sql = "SELECT * FROM categoria";
         PreparedStatement statement = null;
         ResultSet resultset = null;
         List<Itens_pedido> itenspedidos= new ArrayList<>();
         try{
             statement = conexao.prepareStatement(sql);
             resultset = statement.executeQuery();
             while(resultset.next()){
                 Itens_pedido intemPedidos = new Itens_pedido();
                intemPedidos.setData(resultset.getString("data"));
                intemPedidos.setHora(resultset.getString("hora"));
                intemPedidos.setQtd_pro(resultset.getInt("qtd pro"));
                intemPedidos.setNome_produto(resultset.getString("nome peoduto"));
                 intemPedidos.add(intemPedidos);
             }
         }catch(SQLException e ){
             System.out.println("erro "+e);
         }
         finally{
             ConexaoComMySQL.FecharConexao();
         }
         return itenspedidos;
    }
    
    //UPDATE
    public boolean update (Itens_pedido itemPedido){ 
        String sql = "UPDATE categoria SET descricao = ? WHERE id= ?";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
                statement.setString(1, itemPedido.getData());
        statement.setString(1, itemPedido.getHora());
        statement.setInt(1, itemPedido.getQtd_pro());
        statement.setString(1, itemPedido.getNome_produto());
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
    public boolean delete (Itens_pedido itemPedido){
        String sql = "DELETE FROM categoria WHERE id = ?";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
                statement.setString(1, itemPedido.getData());
        statement.setString(1, itemPedido.getHora());
        statement.setInt(1, itemPedido.getQtd_pro());
        statement.setString(1, itemPedido.getNome_produto());
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

