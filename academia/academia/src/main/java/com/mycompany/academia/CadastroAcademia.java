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
public class CadastroAcademia {
    public String nomeSistemaeVersao;
    public String nomeAcademia;
    public String enderecoAcademia;
    public String horarioFuncionamento;
    public String contatoAcademia;
    
    public CadastroAcademia(String sistema){
        this.nomeSistemaeVersao = sistema;
    }

    public String getNomeSistemaeVersao() {
        return nomeSistemaeVersao;
    }

    public void setNomeSistemaeVersao(String nomeSistemaeVersao) {
        this.nomeSistemaeVersao = nomeSistemaeVersao;
    }

    public String getNomeAcademia() {
        return nomeAcademia;
    }

    public void setNomeAcademia(String nomeAcademia) {
        this.nomeAcademia = nomeAcademia;
    }

    public String getEnderecoAcademia() {
        return enderecoAcademia;
    }

    public void setEnderecoAcademia(String enderecoAcademia) {
        this.enderecoAcademia = enderecoAcademia;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public String getContatoAcademia() {
        return contatoAcademia;
    }

    public void setContatoAcademia(String contatoAcademia) {
        this.contatoAcademia = contatoAcademia;
    }
}
