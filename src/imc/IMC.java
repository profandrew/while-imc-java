package imc;

import javax.swing.JOptionPane;

public class IMC {

    public static void main(String[] args) {
        
        boolean finalizar = false;
        
        while(!finalizar){
           String peso = JOptionPane.showInputDialog("Bem vindo ao programa de IMC\nEntre com seu peso:");
           String altura = JOptionPane.showInputDialog("Legal, agora entre com sua altura:");
           double pesoConvertido = Double.parseDouble(peso);
           double alturaConvertida = Double.parseDouble(altura);
            
           
           double resultadoIMC = pesoConvertido / (alturaConvertida*alturaConvertida);
           
            if(resultadoIMC < 18){
                JOptionPane.showMessageDialog(null, "Precisa comer um pouquinho mais.\n(Abaixo do peso)");
            } else if(resultadoIMC < 25){
                JOptionPane.showMessageDialog(null, "Muito bom, você está comendo bem.");
            } else if(resultadoIMC < 31){
                JOptionPane.showMessageDialog(null, "Ops, você está comendo bem 😅.\n(Sobrepeso)");
            } else {
                JOptionPane.showMessageDialog(null, "OMG! 😱 Você está obeso.");
            }
            
            int resultadoSaida = JOptionPane.showConfirmDialog(null, "Deseja finalizar o programa?");
            
            if(resultadoSaida == 0) {
                finalizar = true;
            }
        }
    }
    
}
