package Opdrachten;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht_1 extends Applet {
    TextField tekstvak;
    String cijfer1;
    Label label;
    int cijfer2;
    int eind;


    public void init(){
        label= new Label("vul een getal in:");
        tekstvak= new TextField("",20);
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
        }
   public void paint(Graphics g){
        g.drawString("het grootste getal:"+eind,50,50);

        }
    class TekstvakListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        cijfer1 = tekstvak.getText();
        cijfer2 = Integer.parseInt(cijfer1);
        if (cijfer2 > eind){
            eind = cijfer2;
        }
        repaint();
    }
 }
}
