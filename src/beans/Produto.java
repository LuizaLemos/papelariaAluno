
package beans;

import java.util.List;


public class Produto {

    public static void add(List<Produto> produtos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    public String NomePro;
    public String TamanhoProduto;
    public String Marca;
    public String Preco;
    public int CodProduto;

    public Produto(String NomePro, String TamanhoProduto, String Marca, String Preco, int CodProduto) {
        this.NomePro = NomePro;
        this.TamanhoProduto = TamanhoProduto;
        this.Marca = Marca;
        this.Preco = Preco;
        this.CodProduto = CodProduto;
    }

    public Produto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNomePro() {
        return NomePro;
    }

    public String getTamanhoProduto() {
        return TamanhoProduto;
    }

    public String getMarca() {
        return Marca;
    }

    public String getPreco() {
        return Preco;
    }

    public int getCodProduto() {
        return CodProduto;
    }

    public void setNomePro(String NomePro) {
        this.NomePro = NomePro;
    }

    public void setTamanhoProduto(String TamanhoProduto) {
        this.TamanhoProduto = TamanhoProduto;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setPreco(String Preco) {
        this.Preco = Preco;
    }

    public void setCodProduto(int CodProduto) {
        this.CodProduto = CodProduto;
    }

    
    
}
