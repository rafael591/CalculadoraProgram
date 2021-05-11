/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraprogram;

import java.util.Scanner;

/**
 *
 * @author Rafael Moreno
 */
public class CalculadoraProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int val1,val2;
        
        System.out.println("Escoja la operación que desea realizar: ");
        
        System.out.println("0. Suma");
        
        System.out.println("1. Resta");
        
        System.out.println("2. Multiplicación");
        
        System.out.println("3. División");
        
        int opcion = entrada.nextInt();
        
        System.out.println("Ingrese el valor 1: ");
        
        val1 = entrada.nextInt();
        
        System.out.println("Ingrese el valor 2: ");
        
        val2 = entrada.nextInt();
        
        Calculadora Calc = new Calculadora(val1,val2);
        
        int suma = Calc.suma();
        
        int resta = Calc.resta();
        
        int multiplicar = Calc.multiplicar();
        
        double division = Calc.division();
        
        
        switch (opcion) {
            case 0:
                
                System.out.println("El resultado de la suma es: " + suma);
                break;
                
            case 1:
                
                System.out.println("El resultado de la resta es: " + resta);
                break;
            case 2:
                
                System.out.println("El resultado de la multiplicación es: " + multiplicar);
                break;
            case 3:
                
                System.out.println("El resultado de la división es: " + division);
                break;
            default:
                System.out.println("Ingrese el número de la operación que desea realizar correctamente");
        }
    }
    
}
