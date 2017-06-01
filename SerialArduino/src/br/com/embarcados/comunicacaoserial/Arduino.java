/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.embarcados.comunicacaoserial;

import javax.swing.JButton;

/**
 * @author klauder
 */
public class Arduino {
  private ControlePorta arduino;
  
  /**
   * Construtor da classe Arduino
   */
  public Arduino(){
      arduino = new ControlePorta("COM3",9600);//Windows - porta e taxa de transmissão
      //arduino = new ControlePorta("/dev/ttyUSB0",9600);//Linux - porta e taxa de transmissão
  }    

  /**
   * Envia o comando para a porta serial
   * @param button - Botão que é clicado na interface Java
   */
  public void comunicacaoArduino(JButton button) {        
    if("Frente".equals(button.getActionCommand())){
      arduino.enviaDados('B');
      System.out.println(button.getText());//Imprime o nome do botão pressionado
    }
    else if("Traz".equals(button.getActionCommand())){
      arduino.enviaDados('F');
      System.out.println(button.getText());
    }
    else if("Direita".equals(button.getActionCommand())){
      arduino.enviaDados('R');
      System.out.println(button.getText());
    }
    else if("Esquerda".equals(button.getActionCommand())){
      arduino.enviaDados('L');
      System.out.println(button.getText());
    }
    else if("Pare".equals(button.getActionCommand())){
      arduino.enviaDados('S');
      System.out.println(button.getText());
    }
    else{
      arduino.close();
      System.out.println(button.getText());//Imprime o nome do botão pressionado
    }
  }
}