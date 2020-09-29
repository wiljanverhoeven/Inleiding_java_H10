package Opdrachten;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht_5 extends Applet {
    TextField tekstvak1, tekstvak2, tekstvak3, tekstvak4;
    Button knop;
    Label label;
    String antwoord1, antwoord2, antwoord3, antwoord4, tekst1, tekst2, tekst3, tekst4;
    int cijfer1, cijfer2, cijfer3, cijfer4, gemidelde;

    public void init() {
        label = new Label("vul uw cijfers in:");
        tekstvak1 = new TextField("", 10);
        tekstvak2 = new TextField("", 10);
        tekstvak3 = new TextField("", 10);
        tekstvak4 = new TextField("", 10);
        knop = new Button();
        knop.setLabel("OK");
        knop.addActionListener(new KnopListener());


        add(label);
        add(tekstvak1);
        add(tekstvak2);
        add(tekstvak3);
        add(tekstvak4);
        add(knop);
        tekst1 ="vul uw cijfer in";
        tekst2 ="vul uw cijfer in";
        tekst3 ="vul uw cijfer in";
        tekst4 ="vul uw cijfer in";
    }

    public void paint(Graphics g) {
        g.drawString("cijfer1: "+tekst1, 50, 90);
        g.drawString("cijfer2: "+tekst2, 50, 110);
        g.drawString("cijfer3: "+tekst3, 50, 130);
        g.drawString("cijfer4: "+tekst4, 50, 150);
        g.drawString("het gemidelde is: "+gemidelde, 50, 170);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            antwoord1 = tekstvak1.getText();
            antwoord2 = tekstvak2.getText();
            antwoord3 = tekstvak3.getText();
            antwoord4 = tekstvak4.getText();
            cijfer1 = Integer.parseInt(antwoord1);
            cijfer2 = Integer.parseInt(antwoord2);
            cijfer3 = Integer.parseInt(antwoord3);
            cijfer4 = Integer.parseInt(antwoord4);
            gemidelde = (cijfer1 + cijfer2 + cijfer3 + cijfer4)/4;
            if (cijfer1 >= 5.5){
                tekst1= "u heeft een voldoende";
            }
            else {
                tekst1 = "u heeft een onvoldoende";
            }

            if (cijfer2 >= 5.5){
                tekst2= "u heeft een voldoende";
            }
            else {
                tekst2 = "u heeft een onvoldoende";
            }

            if (cijfer3 >= 5.5){
                tekst3= "u heeft een voldoende";
            }
            else {
                tekst3 = "u heeft een onvoldoende";
            }

            if (cijfer4 >= 5.5){
                tekst4= "u heeft een voldoende";
            }
            else {
                tekst4 = "u heeft een onvoldoende";
            }

            repaint();
        }
    }
}