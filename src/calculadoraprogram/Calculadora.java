/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraprogram;

/**
 *
 * @author Rafael Moreno
 */
public class Calculadora {
    //atributos
    private int valor1;
    private int valor2;
    //construcciones
    public Calculadora(){
        
    }
    
    public Calculadora(int valor1, int valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    //metodos
    public int suma(){
        int suma = this.valor1 + this.valor2;
        return suma;
    }
    
    public int resta(){
        int resta = this.valor1 - this.valor2;
        return resta;
    }
    
    public int multiplicar(){
        int multiplicar = this.valor1 * this.valor2;
        return multiplicar;
    }
    
    public double division(){
        double division = (double) this.valor1 / (double) this.valor2;
        return division;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
}
