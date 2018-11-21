package data.access.object;

import conexaobanco.ConexaoComMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import beans.Cadastro_aluno;

/**
 *
 * @author Camila <Camila.Serrao>
 */

//classe Data Acess Object. Criar uma classe DOA para cada classe bean.
//Exemplo com classe Categoria.

public class CadastroAlunoDAO {
    private Connection conexao=null;

    public CadastroAlunoDAO() {
    conexao = ConexaoComMySQL.getConexaoMySQL();
    }
    
    //inserir
    public boolean insert(Cadastro_aluno cadastroAluno){ 
        String sql = "INSERT INTO cadastro aluno (num_cadastro, nome, endereço, dataNasc, numeroCell, escola, serie) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
        statement.setString(1, cadastroAluno.getDataNasc());
        statement.setString(2, cadastroAluno.getEndereco());
        statement.setString(3, cadastroAluno.getEscola());
        statement.setString(4, cadastroAluno.getNome());
        statement.setString(5, cadastroAluno.getNumeroCell());
        statement.setString(6, cadastroAluno.getSerie());
        statement.setInt(6, cadastroAluno.getNum_cadastro());
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
    public List<Cadastro_aluno> select(){ 
         String sql = "SELECT * FROM Cadastro_aluno";
         PreparedStatement statement = null;
         ResultSet resultset = null;
         List<Cadastro_aluno> cadastroAlunos = new ArrayList<>();
         try{
             statement = conexao.prepareStatement(sql);
             resultset = statement.executeQuery();
             while(resultset.next()){
                 Cadastro_aluno cadastroAluno = new Cadastro_aluno();
                 cadastroAluno.setDataNasc(resultset.getString("data de nascimento"));
                 cadastroAluno.setEndereco(resultset.getString("endereço"));
                 cadastroAluno.setEscola(resultset.getString("escola"));
                 cadastroAluno.setNum_cadastro(resultset.getInt("numero cadastro"));                 
                 cadastroAluno.setNome(resultset.getString("nome"));
                 cadastroAluno.setNumeroCell(resultset.getString("numero de cell"));
                 cadastroAluno.setSerie(resultset.getString("serie"));   
                 Cadastro_aluno.add(cadastroAluno);
             }
         }catch(SQLException e ){
             System.out.println("erro "+e);
         }
         finally{
             ConexaoComMySQL.FecharConexao();
         }
         return cadastroAlunos;
    }
    
    //UPDATE
    public boolean update (Cadastro_aluno cadastroAluno){ 
        String sql = "UPDATE cadastro aluno SET descricao = ? WHERE id= ?";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
        statement.setString(1, cadastroAluno.getDataNasc());
        statement.setString(2, cadastroAluno.getEndereco());
        statement.setString(3, cadastroAluno.getEscola());
        statement.setString(4, cadastroAluno.getNome());
        statement.setString(5, cadastroAluno.getNumeroCell());
        statement.setString(6, cadastroAluno.getSerie());
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
    public boolean delete (Cadastro_aluno cadastroAluno){
        String sql = "DELETE FROM Cadastro aluno WHERE id = ?";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
        statement.setString(1, cadastroAluno.getDataNasc());
        statement.setString(2, cadastroAluno.getEndereco());
        statement.setString(3, cadastroAluno.getEscola());
        statement.setString(4, cadastroAluno.getNome());
        statement.setString(5, cadastroAluno.getNumeroCell());
        statement.setString(6, cadastroAluno.getSerie());
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
