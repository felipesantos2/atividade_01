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
        JOptionPane.showMessageDialog(null, "Vamos fazer nossas operações \n");
        
        // inicio do laço 
        do{
             JOptionPane.showMessageDialog(null,
                " ------------------------ DIGITE : ------------------------ \n 1 - Para Somar:\n 2 - Para subtrair: \n 3 - Para Multiplicar: \n 4 - Para Dividir: \n 5 - Exponenciação( Quadrado de um numero: ) \n 0 - Para voltar do inicio");
            
           // Descobrindo as operações;
          operacao = Integer.parseInt(JOptionPane.showInputDialog("Digite sua operação:"));


            if (operacao > 5 || operacao < 0) {
                JOptionPane.showMessageDialog(null, "Opção Invalida      \n Execute o Código Novamente");
                System.exit(0);

            }

            // criando o objeto do tipo Calculos
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
                        // resultado a ser exibido
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
                        // resultado a ser exibido
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
                        // resultado a ser exibido
                        operar.multiplicar();
                        break;
                    case 4:
                        // Divisão
                        JOptionPane.showMessageDialog(null, "Você escolheu a Divisão \n");

                        // pegando os valores da operação
                        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
                        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

                        // passando os valores para os metodos
                        operar.set_valor1(valor1);
                        operar.set_valor2(valor2);
                        // resultado a ser exibido
                        operar.dividir();
                        break;

                    case 0:
                        JOptionPane.showMessageDialog(null,
                                "Você escolheu retornar do inicio \n Execute o código novamente.");
                        break;
                }

            } else {
                    // Exponenciação
                    JOptionPane.showMessageDialog(null, "Você escolheu a Exponênciação \n");
                    valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o  valor:"));

                    // passando os valores para os metodos
                    operar.set_valor1(valor1);

                    // resultado a ser exibido
                    operar.quadrado();

             }

        }while(operacao !=0 );
        
        // validadado as operações

        System.out.println("Executado com sucesso");

    }
}
