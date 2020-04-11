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

    /**
     * Realiza un metodo que recive por parametro la operacion a realizar
     *
     * @param opcion 1 para suma ,2 para resta, 3 para multiplicar ,4 para
     * dividir
     * @return el valor realizado con los 2
     * @throws NumMenorException en caso que el num1 sea menor que el num2     *
     *
     */
    public float operacion(int opcion) throws NumMenorException {
        
        switch (opcion) {
            case 1: //Suma
                return num1 + num2;

            case 2: //Resta
                if (num1 < num2) {
                    throw new NumMenorException();
                } else {
                    return num1 - num2;
                }

            case 3: //Multiplicacion
                return num1 * num2;

            case 4: //Division
                if (num1 < num2) {
                    throw new NumMenorException();
                } else {
                    return num1 / num2;
                }

            default:
                return 0;
        }
    }
}
