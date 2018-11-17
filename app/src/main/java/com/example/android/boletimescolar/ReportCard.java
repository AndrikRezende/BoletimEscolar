package com.example.android.boletimescolar;

import java.util.Arrays;

/**
 * Created by Andrik on 08/02/2018.
 */

public class ReportCard {

    private String nomeAluno;
    private int ano;
    private String [] nomeProfessor;
    private String [] nomeDisciplina;
    private int [] notas;

    public ReportCard(String nomeAluno,int ano,int quantidadeDisciplinas) {
        //Para cada disciplina há uma nota e um professor. Relação 1-1-1
        this.nomeAluno=nomeAluno;
        this.ano=ano;
        nomeProfessor=new String[quantidadeDisciplinas];
        nomeDisciplina=new String[quantidadeDisciplinas];
        notas=new int[quantidadeDisciplinas];
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String[] getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String[] nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String[] getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String[] nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", ano=" + ano +
                ", nomeProfessor=" + Arrays.toString(nomeProfessor) +
                ", nomeDisciplina=" + Arrays.toString(nomeDisciplina) +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

}
