package data.access.object;

import conexaobanco.ConexaoComMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import beans.Produto;

/**
 *
 * @author Camila <Camila.Serrao>
 */

//classe Data Acess Object. Criar uma classe DOA para cada classe bean.
//Exemplo com classe Categoria.

public class ProdutoDAO {
    private Connection conexao=null;

    public ProdutoDAO() {
    conexao = ConexaoComMySQL.getConexaoMySQL();
    }
    
    //inserir
    public boolean insert(Produto produtos){ 
        String sql = "INSERT INTO categoria (id, nome_produto, qtd_pro, preço, tipo_Produto) VALUES (?,?,?,?,?)";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
        statement.setString(1, produtos.getMarca());
        statement.setString(2, produtos.getNomePro());
        statement.setString(3, produtos.getPreco());
        statement.setString(1, produtos.getTamanhoProduto());
        statement.setInt(1, produtos.getCodProduto());
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
    public List<Produto> select(){ 
         String sql = "SELECT * FROM categoria";
         PreparedStatement statement = null;
         ResultSet resultset = null;
         List<Produto> produtos = new ArrayList<>();
         try{
             statement = conexao.prepareStatement(sql);
             resultset = statement.executeQuery();
             while(resultset.next()){
                Produto produto = new Produto();
                produto.setMarca(resultset.getString("Marca"));
                produto.setCodProduto(resultset.getInt("Codigo Produto"));
                produto.setNomePro(resultset.getString("Nome Produto"));
                produto.setPreco(resultset.getString("Preço"));
                produto.setTamanhoProduto(resultset.getString("Tamanho do Produto"));
                Produto.add(produtos);
             }
         }catch(SQLException e ){
             System.out.println("erro "+e);
         }
         finally{
             ConexaoComMySQL.FecharConexao();
         }
         return produtos;
    }
    
    //UPDATE
    public boolean update (Produto produtos){ 
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
