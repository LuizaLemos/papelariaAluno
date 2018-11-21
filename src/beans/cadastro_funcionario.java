/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import papelariaaluno.cadastro;

/**
 *
 * @author pvhal
 */
public class cadastro_funcionario extends cadastro{
 public String cargo;
 public double salario;

    public cadastro_funcionario(int num_cadastro, String nome, String Endereco, String DataNasc, String NumeroCell,String cargo, double salario) {
        super(num_cadastro, nome, Endereco, DataNasc, NumeroCell);
        this.cargo=cargo;
        this.salario=salario;
    }
    
}
