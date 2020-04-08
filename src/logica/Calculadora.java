/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Arthur
 */
public class Calculadora {

    private int num1;
    private int num2;

    public Calculadora() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public float operacion(int opcion) {
        switch (opcion) {
            case 1: //Suma
                return num1 + num2;

            case 2: //Resta
                return num1 - num2;

            case 3: //Multiplicacion
                return num1 * num2;

            case 4: //Division
                return num1 / num2;

            default:
                return 0;
        }
    }
}