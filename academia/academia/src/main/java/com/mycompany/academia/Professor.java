/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academia;

/**
 *Academia - Projeto Interdisciplinar
 * @author Alisson - Daniela - Danilo - Ruth
 * @version 1.7
 * @since 2022-06-10
 */
public class Professor extends Pessoa{
    private String emailProfessor;
    private String contatoProfessor;

    public String getNomeProfessor() {
        return nome;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nome = nomeProfessor;
    }

    public String getEmailProfessor() {
        return emailProfessor;
    }

    public void setEmailProfessor(String emailProfessor) {
        this.emailProfessor = emailProfessor;
    }

    public String getContatoProfessor() {
        return contatoProfessor;
    }

    public void setContatoProfessor(String contatoProfessor) {
        this.contatoProfessor = contatoProfessor;
    }
    
    @Override
    public String saudacao(){
        return "Seja bem vindo " + this.nome;
    }
    
}
