/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fourj.vendas.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author E.Wellington
 */

@Entity
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa implements Identificavel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPessoa;
    
    private String nomePessoa;
    
    private String cpfPessoa;
    
    private String ruaPessoa;
    
    private String numeroPessoa;
    
    private String bairroPessoa;
    
    private String cepPessoa;
    
    private char estadoPessoa;
    
    private String telefone1Pessoa;
    
    private String telefone2Pessoa;

    @Override
    public Long getId() {
     return this.idPessoa;
    }

    @Override
    public void setId(Long idPessoa) {
     this.idPessoa = idPessoa;
    }
    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

    public String getRuaPessoa() {
        return ruaPessoa;
    }

    public void setRuaPessoa(String ruaPessoa) {
        this.ruaPessoa = ruaPessoa;
    }

    public String getNumeroPessoa() {
        return numeroPessoa;
    }

    public void setNumeroPessoa(String numeroPessoa) {
        this.numeroPessoa = numeroPessoa;
    }

    public String getBairroPessoa() {
        return bairroPessoa;
    }

    public void setBairroPessoa(String bairroPessoa) {
        this.bairroPessoa = bairroPessoa;
    }

    public String getCepPessoa() {
        return cepPessoa;
    }

    public void setCepPessoa(String cepPessoa) {
        this.cepPessoa = cepPessoa;
    }

    public char getEstadoPessoa() {
        return estadoPessoa;
    }

    public void setEstadoPessoa(char estadoPessoa) {
        this.estadoPessoa = estadoPessoa;
    }

    public String getTelefone1Pessoa() {
        return telefone1Pessoa;
    }

    public void setTelefone1Pessoa(String telefone1Pessoa) {
        this.telefone1Pessoa = telefone1Pessoa;
    }

    public String getTelefone2Pessoa() {
        return telefone2Pessoa;
    }

    public void setTelefone2Pessoa(String telefone2Pessoa) {
        this.telefone2Pessoa = telefone2Pessoa;
    }
    
    
    
}
