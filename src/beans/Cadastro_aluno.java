package beans;

import java.util.List;
import java.util.Scanner;



public class Cadastro_aluno{

    public static void add(Cadastro_aluno cadastroAlunos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        public int num_cadastro;
        public String nome;
        public String Endereco;
        public String DataNasc;
        public String NumeroCell;
        public String escola; 
        public String serie;
        public boolean valida;
        
        Scanner read = new Scanner(System.in);

    public Cadastro_aluno(int num_cadastro, String nome, String Endereco, String DataNasc, String NumeroCell, String escola, String serie) {
        this.num_cadastro = num_cadastro;
        this.nome = nome;
        this.Endereco = Endereco;
        this.DataNasc = DataNasc;
        this.NumeroCell = NumeroCell;
        this.escola = escola;
        this.serie = serie;
    }

  
   

    public Cadastro_aluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

  
    
    
    public String getEscola() {
        return escola;
    }

    public String getSerie() {
        return serie;
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

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public void setSerie(String serie) {
        this.serie = serie;
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
    
    // metodos
    

     
    public void cadastrar(String nome, String e_mail, String data_nasc, String endereco, String senha, int CPF, int RG){
        
        this.num_cadastro = num_cadastro;
        this.nome = nome;
        this.Endereco = Endereco;
        this.DataNasc = DataNasc;
        this.NumeroCell = NumeroCell;
        this.escola = escola;
        this.serie = serie;
        this.valida = true;
        System.out.println("Cadastrado");
    }
    
    public void cadastrar(){
        this.valida = true;
        System.out.println("Cadastrado");
    }
  
  public boolean Verificar_cadastro(){
      if(valida){
          System.out.println("Bem vindo");
          return true;
      }
      else
          System.out.println("Cadastro não realizado");
          return false;
}
}