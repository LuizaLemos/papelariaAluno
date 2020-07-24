/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papelariaaluno;

import beans.Cadastro_aluno;
import beans.Produto;
import conexaobanco.ConexaoComMySQL;
import data.access.object.CadastroAlunoDAO;
import data.access.object.ProdutoDAO;


public class PapelariaAluno {

  
    public static void main(String[] args) {
        
        ConexaoComMySQL conexao = new ConexaoComMySQL();
        System.out.println(ConexaoComMySQL.getConexaoMySQL());
        System.out.println(ConexaoComMySQL.status);      
                
       //Cadastro_aluno aluno1 = new Cadastro_aluno(1,"alexandre","gfjgfk","23434","455656765","ifro","2ano");
       //CadastroAlunoDAO Aluno1 = new CadastroAlunoDAO();
       //Aluno1.insert(aluno1);
       
       Produto prod = new Produto("sabao","500g","omo","23.00",10);
       ProdutoDAO produ1 = new ProdutoDAO();
       produ1.insert(prod);
    }
    
}
