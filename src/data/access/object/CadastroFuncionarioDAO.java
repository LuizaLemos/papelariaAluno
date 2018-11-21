
package data.access.object;

import conexaobanco.ConexaoComMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import beans.cadastro_funcionario;

/**
 *
 * @author Camila <Camila.Serrao>
 */

//classe Data Acess Object. Criar uma classe DOA para cada classe bean.
//Exemplo com classe Categoria.

public class CadastroFuncionarioDAO {
    private Connection conexao=null;

    public CadastroFuncionarioDAO() {
    conexao = ConexaoComMySQL.getConexaoMySQL();
    }
    
    //inserir
    public boolean insert(cadastro_funcionario CadastroFuncionario){ 
       String sql = "INSERT INTO cadastro aluno (num_cadastro, nome, endereço, dataNasc, numeroCell, cargo, salario) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
        statement.setString(1, CadastroFuncionario.getDataNasc());
        statement.setString(2, CadastroFuncionario.getEndereco());
        statement.setString(3, CadastroFuncionario.getCargo());
        statement.setString(4, CadastroFuncionario.getNome());
        statement.setString(5, CadastroFuncionario.getNumeroCell());
        statement.setDouble(6, CadastroFuncionario.getSalario());
        statement.setInt(7, CadastroFuncionario.getNum_cadastro());
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
    public List<cadastro_funcionario> select(){ 
         String sql = "SELECT * FROM categoria";
         PreparedStatement statement = null;
         ResultSet resultset = null;
         List<cadastro_funcionario> cadastrafuncionarios = new ArrayList<>();
         try{
             statement = conexao.prepareStatement(sql);
             resultset = statement.executeQuery();
             while(resultset.next()){
                cadastro_funcionario CadastroFuncionario = new cadastro_funcionario();
                CadastroFuncionario.setDataNasc(resultset.getString("data de nascimento"));
                CadastroFuncionario.setEndereco(resultset.getString("endereço"));
                CadastroFuncionario.setCargo(resultset.getString("cargo"));
                CadastroFuncionario.setNum_cadastro(resultset.getInt("numero cadastro"));                 
                CadastroFuncionario.setNome(resultset.getString("nome"));
                CadastroFuncionario.setNumeroCell(resultset.getString("numero de cell"));
                CadastroFuncionario.setSalario(resultset.getDouble("salario"));  
                CadastroFuncionario.add(CadastroFuncionario);
             }
         }catch(SQLException e ){
             System.out.println("erro "+e);
         }
         finally{
             ConexaoComMySQL.FecharConexao();
         }
         return cadastrafuncionarios;
    }
    
    //UPDATE
    public boolean update (cadastro_funcionario CadastroFuncionario){ 
        String sql = "UPDATE categoria SET descricao = ? WHERE id= ?";
        PreparedStatement statement = null;
        try{
        statement.setString(1, CadastroFuncionario.getDataNasc());
        statement.setString(2, CadastroFuncionario.getEndereco());
        statement.setString(3, CadastroFuncionario.getCargo());
        statement.setString(4, CadastroFuncionario.getNome());
        statement.setString(5, CadastroFuncionario.getNumeroCell());
        statement.setDouble(6, CadastroFuncionario.getSalario());
        statement.setInt(7, CadastroFuncionario.getNum_cadastro());
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
    public boolean delete (cadastro_funcionario CadastroFuncionario){
        String sql = "DELETE FROM categoria WHERE id = ?";
        PreparedStatement statement = null;
        try{
        statement.setString(1, CadastroFuncionario.getDataNasc());
        statement.setString(2, CadastroFuncionario.getEndereco());
        statement.setString(3, CadastroFuncionario.getCargo());
        statement.setString(4, CadastroFuncionario.getNome());
        statement.setString(5, CadastroFuncionario.getNumeroCell());
        statement.setDouble(6, CadastroFuncionario.getSalario());
        statement.setInt(7, CadastroFuncionario.getNum_cadastro());
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


