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
public class Aluno extends Pessoa{

    public float peso;
    public float altura;

    
    
    public String imc(){
    float imc = this.peso/(this.altura * this.altura);
    
    if(imc<18.5){
        //Tabela IMC de acordo com sua classificação emitida pela OMS
        return this.nome + " você esta abaixo do peso";
    } else if(imc>18.5&&imc<24.9){
        return this.nome + " você esta com peso normal";
    } else if(imc>=25&&imc<29.9){
        return this.nome + " você esta com excesso de peso";
    } else if(imc>=30&&imc<34.9){
        return this.nome + " você esta com obesidade classe I";
    } else if(imc>=35&&imc<39.9){
        return this.nome + " você esta com obesidade classe II";
    } else if(imc>=40){
        return this.nome + " você esta com obesidade classe III";
    }
        return "Peso informado inválido";
    }
    
    @Override
    public String saudacao(){
        return "Seja bem vindo " + this.nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
