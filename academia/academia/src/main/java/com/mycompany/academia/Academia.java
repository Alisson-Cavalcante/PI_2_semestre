/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.academia;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *Academia - Projeto Interdisciplinar
 * @author Alisson - Daniela - Danilo - Ruth
 * @version 1.7
 * @since 2022-06-10
 */
public class Academia {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Seja bem vindo ao Sistema de Treino Semanal ADDR",
                "Sistema ADDR",JOptionPane.PLAIN_MESSAGE);
        System.out.println("");
        
        Scanner ler = new Scanner(System.in);
        Scanner opc = new Scanner(System.in);
        Scanner nomes = new Scanner(System.in);
        CadastroAcademia c1 = new CadastroAcademia("Sistema ADDR - Versão 1.7");
        Professor pf1 = new Professor();
        Treino treinos = new Treino();
        Aluno[] a1 = new Aluno[5];

        a1[0] = new Aluno();
        a1[1] = new Aluno();
        a1[2] = new Aluno();
        a1[3] = new Aluno();
        a1[4] = new Aluno();
        
        System.out.println(c1.nomeSistemaeVersao);
        
        System.out.println("""
                           
                           Escolha a sua opção:
                           1 - Cadastro de academia 
                           2 - Cadastro de professor 
                           3 - Cadastros de alunos 
                           4 - Imprimir treino do aluno 
                           5 - Editar peso para calcular o novo IMC do aluno
                           6 - Sair""");
        int opcao = opc.nextInt();
        
        while(opcao!=6){
        
        if(opcao==1){
        //CadastroAcademia Classe
        System.out.println("\n");
        System.out.println("Insira o nome da Academia: ");
        c1.setNomeAcademia(nomes.nextLine());
        System.out.println("Digite o endereço completo da " + c1.nomeAcademia + ": ");
        c1.setEnderecoAcademia(nomes.nextLine());
        System.out.println("Horário de funcionamento da " + c1.nomeAcademia + ": ");
        c1.setHorarioFuncionamento(ler.nextLine());
        System.out.println("Digite o número de telefone ou WhatsApp da " + c1.nomeAcademia + ": ");
        c1.setContatoAcademia(ler.nextLine());
        System.out.println("\n");
        
                System.out.println("""
                                   
                           Escolha a sua opção:
                           1 - Cadastro de academia 
                           2 - Cadastro de professor 
                           3 - Cadastros de alunos 
                           4 - Imprimir treino do aluno 
                           5 - Editar peso para calcular o novo IMC do aluno
                           6 - Sair""");
        opcao = opc.nextInt();
               
        } else if(opcao==2){
        //Classe Professor
        System.out.println("\n");
        System.out.println("Digite o nome do professor: ");
        pf1.setNomeProfessor(ler.nextLine());
        System.out.println("Digite o e-mail do professor " + pf1.getNomeProfessor());
        pf1.setEmailProfessor(ler.nextLine());
        System.out.println("Digite o telefone do professor " + pf1.getNomeProfessor());
        pf1.setContatoProfessor(ler.nextLine());
        System.out.println(pf1.saudacao() + "!");
        
        System.out.println("""
                           
                           Escolha a sua opção:
                           1 - Cadastro de academia 
                           2 - Cadastro de professor 
                           3 - Cadastros de alunos 
                           4 - Imprimir treino do aluno 
                           5 - Editar peso para calcular o novo IMC do aluno 
                           6 - Sair""");
        opcao = opc.nextInt();

        } else if(opcao==3){
        //Aluno[] alu = new Aluno[5];
        
        System.out.println("\n");
        System.out.println("Digite os dados dos 5 alunos");     
        for(int i=0;i<5; i++){
            System.out.println("\n");
            System.out.println("Digite o nome do aluno " + (i+1));
            a1[i].setNome(nomes.nextLine()); 
            System.out.println("Digite a idade do " + a1[i].nome + ": ");
            a1[i].setIdade(ler.nextInt());
            System.out.println("Digite o peso do " + a1[i].nome + ": ");
            a1[i].setPeso(ler.nextFloat());
            System.out.println("Digite a sua altura do " + a1[i].nome + ": ");
            a1[i].setAltura(ler.nextFloat());
            System.out.println(a1[i].saudacao() + "!");
        }

        System.out.println("""
                           
                           Escolha a sua opção:
                           1 - Cadastro de academia 
                           2 - Cadastro de professor 
                           3 - Cadastros de alunos 
                           4 - Imprimir treino do aluno 
                           5 - Editar peso para calcular o novo IMC do aluno 
                           6 - Sair""");
        opcao = opc.nextInt();
        
        } else if(opcao==4){
        //Classe Treino - Semanal - 7 dias
        
        System.out.println("\n");              
        treinos.treinoDia1 = "Segunda - Feira";
        treinos.treinoExercicio1 = "Supino reto";
        treinos.treinoExercicio12 = "Supino inclinado";
        treinos.treinoExercicio13 = "Elevação lateral  e frontal";
        treinos.serie1 = "3";
        treinos.repeticao1 = "12";
        
        treinos.treinoDia2 = "Terça - Feira";
        treinos.treinoExercicio2 = "Puxador Costas e frente";
        treinos.treinoExercicio22 = "Remada Alta";
        treinos.treinoExercicio23 = "Rosca Alternada";
        treinos.serie2 = "4";
        treinos.repeticao2 = "10";
 
        treinos.treinoDia3 = "Quarta - Feira";
        treinos.treinoExercicio3 = "Aquecimento na bike";
        treinos.treinoExercicio32 = "Cadeira extensora";
        treinos.treinoExercicio33 = "Agachamento";
        treinos.serie3 = "5";
        treinos.repeticao3 = "8";
        
        treinos.treinoDia4 = "Quinta - Feira";
        treinos.treinoExercicio4 = "Triceps \\Testa";
        treinos.treinoExercicio42 = "Triceps Pulley";
        treinos.treinoExercicio43 = "Triceps Francês";
        treinos.serie4 = "4";
        treinos.repeticao4 = "9";
        
        treinos.treinoDia5 = "Sexta - Feira";
        treinos.treinoExercicio5 = "Remada unilateral com apoio";
        treinos.treinoExercicio52 = "Rosca concentrada";
        treinos.treinoExercicio53 = "Rosca alternada";
        treinos.serie5 = "4";
        treinos.repeticao5 = "10";
        
        treinos.treinoDia6 = "Sábado";
        treinos.treinoExercicio6 = "Stiff/Avanço";
        treinos.treinoExercicio62 = "Camara Flexora";
        treinos.treinoExercicio63 = "Leg 45";
        treinos.serie6 = "8";
        treinos.repeticao6 = "6";
        
        treinos.treinoDia7 = "Domingo";
        treinos.treinoExercicio7 = "Aeróbico livre";

        
        for(int visu = 0;visu<5;visu++){
            
            JOptionPane.showMessageDialog(null,c1.getNomeSistemaeVersao() + "\n \n \n" + "Dados da Academia \n" + "Nome da Academia: " + c1.getNomeAcademia()
                    + "\n" + "Endereço completo: "+c1.getEnderecoAcademia() + "\n" + "Horário de funcionamento: "+c1.getHorarioFuncionamento()
                    + "\n" + "Contato: " + c1.getContatoAcademia() + "\n \n \n" + 
                            
                            "Dados do professor \n" + "Nome do professor: " +pf1.getNomeProfessor() +
                    "\n" + "E-mail: " + pf1.getEmailProfessor() + "\n" + "Telefone: " + pf1.getContatoProfessor() +
                    
                    "\n \n \n"+"Dados do Aluno \n" + "Nome: " + a1[visu].getNome() + "\n" + "Idade: " + a1[visu].getIdade() + "\n" + "Altura: " + a1[visu].getAltura() + "\n" + "Peso: " + a1[visu].getPeso() + "\n" +
                    "IMC: " + a1[visu].imc() +
                    
                    
                    "\n \n \n" +" Treinos semanais "+"\n"+"\n"
                    + treinos.visualizarTreino1() +"\n" + 
                    treinos.visualizarTreino2() + "\n" +
                    treinos.visualizarTreino3() + "\n" +
                    treinos.visualizarTreino4() + "\n" +
                    treinos.visualizarTreino5() + "\n" +
                    treinos.visualizarTreino6() + "\n" +
                    treinos.visualizarTreino7() + "\n");
        }
        
        System.out.println("""
                           
                           Escolha a sua opção:
                           1 - Cadastro de academia 
                           2 - Cadastro de professor 
                           3 - Cadastros de alunos 
                           4 - Imprimir treino do aluno 
                           5 - Editar peso para calcular o novo IMC do aluno
                           6 - Sair""");
        opcao = opc.nextInt();

        
        } else if(opcao==5){
        //Editar IMC  - peso e altura do aluno
        
            System.out.println("\n");
            for(int alunos=0;alunos<5;alunos++){
                System.out.println("Aluno "+ alunos +": " + a1[alunos].nome);
            }
            System.out.println("\n");
            System.out.println("Digite o número do aluno que deseja alterar?");
            int alterarImc = ler.nextInt();
            System.out.println("\n");
            System.out.println("Aluno: " + a1[alterarImc].nome);
            System.out.println("Idade: " + a1[alterarImc].idade);
            System.out.println("Altura: " + a1[alterarImc].altura);
            System.out.println("Digite o novo peso do aluno :" + a1[alterarImc].nome);
            a1[alterarImc].peso = ler.nextFloat();
            System.out.println("Editado com sucesso!");

        System.out.println("\n");     
        System.out.println("""
                           
                           Escolha a sua opção:
                           1 - Cadastro de academia 
                           2 - Cadastro de professor 
                           3 - Cadastros de alunos 
                           4 - Imprimir treino do aluno 
                           5 - Editar peso para calcular o novo IMC do aluno
                           6 - Sair""");
        opcao = opc.nextInt();

        } else if(opcao<=0||opcao>6){
            
            System.out.println("\n Digite a opção desejada de forma correta!");
            
            System.out.println("""
                           
                           Escolha a sua opção:
                           1 - Cadastro de academia 
                           2 - Cadastro de professor 
                           3 - Cadastros de alunos 
                           4 - Imprimir treino do aluno 
                           5 - Editar peso para calcular o novo IMC do aluno
                           6 - Sair""");
        opcao = opc.nextInt();
        
        }

        } 
    }
}