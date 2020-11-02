package com.programem.seguradora;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity /** indica que o Banco de Dados deve criar uma tabela para esse objeto */
public class Cliente {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    String nome;

    Integer idade;

    String endereco;

    public void setId(Integer id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public Integer getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public Integer getIdade(){
        return this.idade;
    }

    public String getEndereco(){
        return this.endereco;
    }

}