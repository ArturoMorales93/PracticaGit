/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("xd");
        System.out.print("Ingrese el primer num: ");
        int num1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo num: ");
        int num2 = sc.nextInt();
        
        Calculadora calcu = new Calculadora(num1, num2);
        
        try {
            System.out.println("Respuesta: " + calcu.operacion(2));
        } catch (NumMenorException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
