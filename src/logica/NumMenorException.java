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
public class NumMenorException extends Exception {

    @Override
    public String getMessage() {
        return "El num1 debe ser mayor que num2";
    }

}
