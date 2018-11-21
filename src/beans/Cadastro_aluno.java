package beans;

import java.util.List;
import papelariaaluno.cadastro;


public class Cadastro_aluno extends cadastro {
 public String escola; 
 public String serie;

    public Cadastro_aluno(String escola, String serie, int num_cadastro, String nome, String Endereco, String DataNasc, String NumeroCell) {
        super(num_cadastro, nome, Endereco, DataNasc, NumeroCell);
        this.escola = escola;
        this.serie = serie;
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
}