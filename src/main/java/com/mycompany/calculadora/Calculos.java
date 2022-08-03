package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class Calculos {
    
     // soma, subtração, multiplicação, divisão
    private int valor1;
    private int valor2;
    
    public void set_valor1(int valor1){
        this.valor1 = valor1;
    }
    
    public void set_valor2(int valor2){
        this.valor2 = valor2;
    }
    
    private Integer get_valor2(){
       return this.valor2;
    }
    
    private Integer get_valor1(){
       return this.valor1;
    }
 //metodo de soma
    public Integer  somar(){
        
        int i =  this.get_valor1() + this.get_valor2();
        
        JOptionPane.showMessageDialog(null, "O resultado final é: " + i);
        return 0;

    }
    
    //metodo de soma
    public Integer  subtrair(){
        
        int i =  this.get_valor1() - this.get_valor2();
        
        JOptionPane.showMessageDialog(null, "O resultado final é: " + i);
        return 0;

    }
            
    public Integer  multiplicar(){

        int i =  this.get_valor1() * this.get_valor2();

        JOptionPane.showMessageDialog(null, "O resultado final é: " + i);
        return 0;

    }
    
    public Integer  dividir(){

        int i =  this.get_valor1() / this.get_valor2();

        JOptionPane.showMessageDialog(null, "O resultado final é: " + i);
        return 0;

    }
    
    public Integer  quadrado(){

        int i =  this.get_valor1() * this.get_valor1();

        JOptionPane.showMessageDialog(null, "O resultado final é: " + i);
        return 0;

    }
     
}
     