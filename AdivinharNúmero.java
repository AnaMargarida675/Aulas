package Aulas;

import com.sun.deploy.services.Service;

public class AdivinharNúmero {

    public static void main (String[] args)
    {
        Random rnd=new random;
        int numEscondido=rnd.nextInt( bound: 100);
        int num=0;
        int tent=0;

        JOptionPane.showMessageerDialog(parentCompoment: null, messager: "tente adivinhar o numero escondido(até 100)!")
        do{
            tent++;
            num=Interger.parseInt(JOptionPne.showImputDialog(parentComponente: null, messsager: "Número:");
            if(num>numEscondido)
                JOptionPne.showImputDialog(parentComponente: null, messsager: "Tente o número menor:");
            else if(num<numEscolhido)
                JOptionPne.showImputDialog(parentComponente: null, messsager: "Tente o número maior:");
            else
            JOptionPne.showImputDialog(parentComponente: null, messsager: "Parabéns! Adivinhou o numero escolhido ");
            {
                num+"!! á " + tent + "º Tentativas!");
            }
        }while(true!=numEscolhido);
        System.exit(tatus:0);



    }
}

