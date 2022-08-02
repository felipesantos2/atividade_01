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

        // mensagem inicial a ser exibida
        JOptionPane.showMessageDialog(null, "Vamos Fazer nossas operações \n");

        JOptionPane.showMessageDialog(null,
                "Digite: \n 1 - Para somar:\n 2 - Para subtrair: \n 3 - Para multiplicar: \n 4 - Para dividir: \n 5 - Exponenciação( Quadrado de um numero: ) \n 0 - Para voltar do Inicio");

            // Descobrindo as operações;
            operacao = Integer.parseInt(JOptionPane.showInputDialog("Digite sua operação:"));
    
            // validadado as operações
            
            if (operacao > 5 || operacao < 0) {
                JOptionPane.showMessageDialog(null, "Opção Invalidas      \n Execute o Código Novamente");
                System.exit(0);

            }

            // criando o objeto dp tipo Calculos 
            Calculos operar = new Calculos();

            // caso especifido da exponenciacão que só necessita de um unico valor entrada
            if (operacao != 5) {

                switch (operacao) {
                    case 1:
                        // Adição
                        JOptionPane.showMessageDialog(null, "Você escolheu a Adição \n");

                        // pegando os valores da operação

                        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
                        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

                        // passsando os valores para minha classe Calculos

                        operar.set_valor1(valor1);
                        operar.set_valor2(valor2);
                        operar.somar();
                        break;
                    case 2:
                        // Subtração
                        JOptionPane.showMessageDialog(null, "Você escolheu a Subtração \n");

                        // Calculos subtracao = new Calculos();
                        // pegando os valores da operação

                        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
                        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

                        // passsando os valores para minha classe Calculos

                        operar.set_valor1(valor1);
                        operar.set_valor2(valor2);
                        operar.subtrair();
                        break;
                    case 3:
                        // multiplicação
                        JOptionPane.showMessageDialog(null, "Você escolheu a multiplicação \n");

                        
                        // pegando os valores da operação

                        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
                        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

                        // passsando os valores para minha classe Calculos

                        operar.set_valor1(valor1);
                        operar.set_valor2(valor2);
                        operar.multiplicar();
                        break;
                    case 4:
                        // Divisão
                        JOptionPane.showMessageDialog(null, "Você escolheu a Divisão \n");
                        Calculos divisao = new Calculos();
                        // pegando os valores da operação

                        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
                        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

                        // passsando os valores para minha classe Calculos

                        operar.set_valor1(valor1);
                        operar.set_valor2(valor2);
                        operar.dividir();
                        break;

                    case 0:
                        JOptionPane.showMessageDialog(null,
                                "Você escolheu retornar do inicio \n execute o código novamente.");
                        break;
                }

            } else {

                JOptionPane.showMessageDialog(null, "Você escolheu a Exponênciação \n");
                // Calculos exponenciacao = new Calculos();
                // pegando os valores da operação

                valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o  valor:"));
                // valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo
                // valor:"));

                // passsando os valores para minha classe Calculos

                operar.set_valor1(valor1);
                // exponenciacao.set_valor2(valor2);
                operar.quadrado();

            }
        System.out.println("Executado com sucesso");

    }
}
