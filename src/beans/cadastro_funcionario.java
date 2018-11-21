/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;



/**
 *
 * @author pvhal
 */
public class cadastro_funcionario{
    public int num_cadastro;
    public String nome;
    public String Endereco;
    public String DataNasc;
    public String NumeroCell;
    public String cargo;
    public double salario;

    public cadastro_funcionario(int num_cadastro, String nome, String Endereco, String DataNasc, String NumeroCell, String cargo, double salario) {
        this.num_cadastro = num_cadastro;
        this.nome = nome;
        this.Endereco = Endereco;
        this.DataNasc = DataNasc;
        this.NumeroCell = NumeroCell;
        this.cargo = cargo;
        this.salario = salario;
    }
  

      
    

    public cadastro_funcionario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public int getNum_cadastro() {
        return num_cadastro;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public String getDataNasc() {
        return DataNasc;
    }

    public String getNumeroCell() {
        return NumeroCell;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNum_cadastro(int num_cadastro) {
        this.num_cadastro = num_cadastro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public void setDataNasc(String DataNasc) {
        this.DataNasc = DataNasc;
    }

    public void setNumeroCell(String NumeroCell) {
        this.NumeroCell = NumeroCell;
    }

    public void add(cadastro_funcionario CadastroFuncionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
