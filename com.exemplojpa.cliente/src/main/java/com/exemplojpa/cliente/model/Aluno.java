package com.exemplojpa.cliente.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "ALUNO")
@NamedQueries({@NamedQuery(name = "Aluno.findAll", query = "SELECT a FROM Aluno a")})
public class Aluno {
    
    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    private String matricula;

    private String nome;
    private int ano;

    public Aluno() {}

    public Aluno(String matricula, String nome, int ano) {
        this.matricula = matricula;
        this.nome = nome;
        this.ano = ano;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "[Nome: "+this.nome+", Matricula: "+this.matricula+", Ano: "+this.ano+"]";
    }
}
