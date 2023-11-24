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
public class Treino {
    public String treinoDia1;
    public String treinoExercicio1;
    public String treinoExercicio12;
    public String treinoExercicio13;
    public String repeticao1;
    public String serie1;

    public String treinoDia2;
    public String treinoExercicio2;
    public String treinoExercicio22;
    public String treinoExercicio23;
    public String repeticao2;
    public String serie2;
    
    public String treinoDia3;   
    public String treinoExercicio3;
    public String treinoExercicio32;
    public String treinoExercicio33;
    public String repeticao3;
    public String serie3;
    
    public String treinoDia4;       
    public String treinoExercicio4;
    public String treinoExercicio42;
    public String treinoExercicio43;
    public String repeticao4;
    public String serie4;
 
    public String treinoDia5;   
    public String treinoExercicio5;
    public String treinoExercicio52;
    public String treinoExercicio53;
    public String repeticao5;
    public String serie5;
  
    public String treinoDia6;   
    public String treinoExercicio6;
    public String treinoExercicio62;
    public String treinoExercicio63;
    public String repeticao6;
    public String serie6;
    
    public String treinoDia7;   
    public String treinoExercicio7;

    public String visualizarTreino1 (){
        return "Os exercícios da " + this.treinoDia1 + " são: " + this.treinoExercicio1 
                + ", " + this.treinoExercicio12 + ", " + this.treinoExercicio13 + " com " + this.serie1 + 
                " séries e " + this.repeticao1 + " repetições";

    }
    
    public String visualizarTreino2 (){
        return "Os exercícios da " + this.treinoDia2 + " são: " + this.treinoExercicio2 
                + ", " + this.treinoExercicio22 + ", " + this.treinoExercicio23 + " com " + this.serie2 + 
                " séries e " + this.repeticao2 + " repetições";

    }
    
    public String visualizarTreino3 (){
        return "Os exercícios da " + this.treinoDia3 + " são: " + this.treinoExercicio3 
                + ", " + this.treinoExercicio32 + ", " + this.treinoExercicio33 + " com " + this.serie3 + 
                " séries e " + this.repeticao3 + " repetições";

    }
    
    public String visualizarTreino4 (){
        return "Os exercícios da " + this.treinoDia4 + " são: " + this.treinoExercicio4 
                + ", " + this.treinoExercicio42 + ", " + this.treinoExercicio43 + " com " + this.serie4 + 
                " séries e " + this.repeticao4 + " repetições";

    }
    
    public String visualizarTreino5 (){
        return "Os exercícios da " + this.treinoDia5 + " são: " + this.treinoExercicio5 
                + ", " + this.treinoExercicio52 + ", " + this.treinoExercicio53 + " com " + this.serie5 + 
                " séries e " + this.repeticao5 + " repetições";

    }
    
    public String visualizarTreino6 (){
        return "Os exercícios do " + this.treinoDia6 + " são: " + this.treinoExercicio6 
                + ", " + this.treinoExercicio62 + ", " + this.treinoExercicio63 + " com " + this.serie6 + 
                " séries e " + this.repeticao6 + " repetições";

    }
    
    public String visualizarTreino7(){
        return "Os exercício do " + this.treinoDia7 + " são " + this.treinoExercicio7;
    }
    
}
