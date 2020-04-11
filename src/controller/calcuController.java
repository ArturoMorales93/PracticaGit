/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.Calculadora;
import logica.FrmCalcu;
import logica.NumMenorException;

/**
 *
 * @author Daniel-san
 *
 */
public class calcuController implements ActionListener {

    private Calculadora calcu;
    private FrmCalcu winCalcu;

    public calcuController(Calculadora calcu, FrmCalcu winCalcu) {
        this.calcu = calcu;
        this.winCalcu = winCalcu;

        this.winCalcu.btnCalcular.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (winCalcu.cmbDivicion.isSelected() || winCalcu.cmbMultiplicar.isSelected() || winCalcu.cmbResta.isSelected()
                    || winCalcu.cmbSuma.isSelected()) {
                if (e.getSource() == winCalcu.btnCalcular && winCalcu.cmbSuma.isSelected()) {
                    calcu.setNum1(Integer.parseInt(winCalcu.txtNumero1.getText()));
                    calcu.setNum2(Integer.parseInt(winCalcu.txtNumero2.getText()));
                    winCalcu.txtResultado.setText(String.valueOf(calcu.operacion(1)));
                    winCalcu.lblSigno.setIcon(new ImageIcon("src/signos/sumar.png"));
                    JOptionPane.showMessageDialog(winCalcu, "arturo vidal castañeda");
                    

                } else {
                    if (e.getSource() == winCalcu.btnCalcular && winCalcu.cmbResta.isSelected()) {
                        calcu.setNum1(Integer.parseInt(winCalcu.txtNumero1.getText()));
                        calcu.setNum2(Integer.parseInt(winCalcu.txtNumero2.getText()));
                        winCalcu.txtResultado.setText(String.valueOf(calcu.operacion(2)));
                        winCalcu.lblSigno.setIcon(new ImageIcon("src/signos/resta.png"));
                    } else {
                        if (e.getSource() == winCalcu.btnCalcular && winCalcu.cmbMultiplicar.isSelected()) {
                            calcu.setNum1(Integer.parseInt(winCalcu.txtNumero1.getText()));
                            calcu.setNum2(Integer.parseInt(winCalcu.txtNumero2.getText()));
                            winCalcu.txtResultado.setText(String.valueOf(calcu.operacion(3)));
                            winCalcu.lblSigno.setIcon(new ImageIcon("src/signos/multiplicar.png"));
                        } else {
                            if (e.getSource() == winCalcu.btnCalcular && winCalcu.cmbDivicion.isSelected()) {
                                calcu.setNum1(Integer.parseInt(winCalcu.txtNumero1.getText()));
                                calcu.setNum2(Integer.parseInt(winCalcu.txtNumero2.getText()));
                                winCalcu.txtResultado.setText(String.valueOf(calcu.operacion(4)));
                                winCalcu.lblSigno.setIcon(new ImageIcon("src/signos/dividir.png"));
                            }
                        }
                    }

                }
            } else {
                JOptionPane.showMessageDialog(winCalcu, "Seleccione una operacion o revise que esten llenos los campos");
            }
        } catch (NumberFormatException a) {
            JOptionPane.showMessageDialog(winCalcu, "Se ingreso una letra en campo de numero\nRevise");
        } catch (NumMenorException ex){
            JOptionPane.showMessageDialog(winCalcu, ex.getMessage());
        }
    }


}
