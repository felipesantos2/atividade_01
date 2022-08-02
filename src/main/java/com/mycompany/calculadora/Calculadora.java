/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class Calculadora {

    public static void main(String[] args) {
        int operacao;
        int valor1, valor2;

        JOptionPane.showMessageDialog(null, "Vamos Fazer nossas operações \n");

        JOptionPane.showMessageDialog(null,
                "Digite: \n 1 - Para somar:\n 2 - Para subtrair: \n 3 - Para multiplicar: \n 4 - Para dividir: \n 5 - Exponenciação(Quadrado de um numero:) \n 0 - Para voltar do Inicio");
        // Descobrindo as operações;
        operacao = Integer.parseInt(JOptionPane.showInputDialog("Digite sua operação:"));

        // caso especifido da exponenciacao que só necessita de um unico valor de
        // entrada
        if (operacao != 5) {

            switch (operacao) {
                case 1:
                    // Adição
                    JOptionPane.showMessageDialog(null, "Você escolheu a Adição \n");

                    Calculos adicao = new Calculos();
                    // pegando os valores da operação

                    valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
                    valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

                    // passsando os valores para minha classe Calculos

                    adicao.set_valor1(valor1);
                    adicao.set_valor2(valor2);
                    adicao.somar();
                    break;
                case 2:
                    // Subtração
                    JOptionPane.showMessageDialog(null, "Você escolheu a Subtração \n");

                    Calculos subtracao = new Calculos();
                    // pegando os valores da operação

                    valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
                    valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

                    // passsando os valores para minha classe Calculos

                    subtracao.set_valor1(valor1);
                    subtracao.set_valor2(valor2);
                    subtracao.subtrair();
                    break;
                case 3:
                    // multiplicação
                    JOptionPane.showMessageDialog(null, "Você escolheu a multiplicação \n");

                    Calculos multiplicar = new Calculos();
                    // pegando os valores da operação

                    valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
                    valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

                    // passsando os valores para minha classe Calculos

                    multiplicar.set_valor1(valor1);
                    multiplicar.set_valor2(valor2);
                    multiplicar.multiplicar();
                    break;
                case 4:
                    // Divisão
                    JOptionPane.showMessageDialog(null, "Você escolheu a Divisão \n");
                    Calculos divisao = new Calculos();
                    // pegando os valores da operação

                    valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
                    valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

                    // passsando os valores para minha classe Calculos

                    divisao.set_valor1(valor1);
                    divisao.set_valor2(valor2);
                    divisao.dividir();
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null,
                            "Você escolheu retornar do inicio \n execute o código novamente.");
                    break;
            }

        } else {

            JOptionPane.showMessageDialog(null, "Você escolheu a Exponênciação \n");
            Calculos exponenciacao = new Calculos();
            // pegando os valores da operação

            valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o  valor:"));
            // valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo
            // valor:"));

            // passsando os valores para minha classe Calculos

            exponenciacao.set_valor1(valor1);
            // exponenciacao.set_valor2(valor2);
            exponenciacao.quadrado();

        }

    }
}
