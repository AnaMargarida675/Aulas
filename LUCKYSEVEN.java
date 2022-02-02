package Aulas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LUCKYSEVEN {
    private JLabel Labelnum1;
    private JLabel Labelnum2;
    private JLabel Labelnum3;
    private JButton buttonLuckySeven;
    private JLabel LabelPrémio;
    private Container panelLuckeSeven;

    public static  void  main(String[] args)
    {
        JFrame frame=new JFrame("Lucky Seven");
        frame.setContentPane(new LUCKYSEVEN().panelLuckeSeven);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public LUCKYSEVEN() {
        buttonLuckySeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rnd=new Random();
                int num1= rnd.nextInt(8);
                int num2= rnd.nextInt(8);
                int num3= rnd.nextInt(8);

                Labelnum1.setText(String.valueOf(num1));
                Labelnum2.setText(String.valueOf(num2));
                Labelnum3.setText(String.valueOf(num3));

                String prémio="";
                if(num1==7 && num2==7 && num3==7)
                    prémio="Parábens ganhou a 1º prémio: 1.000.000€";
                else if ((num1==7 && num2==7 || num3==7) (num2==7 && num3==7)|| (num3==7 && num1==7))
                prémio="Parábens ganhou a 2º prémio: 1.000.000€";
                else if ((num1==7 && num2==7 || num3==7)
                prémio="Parábens ganhou a 3º prémio: 1.000.000€";
                else if ((num1==7 && num2==7 || num3==7)
                prémio="Parábens ganhou a 4º prémio: 1.000.000€";
                else
                    prémio="Não desista! Tente novamente";
                prémioLabel.setText(prémio);

            }
        });
    }
}
