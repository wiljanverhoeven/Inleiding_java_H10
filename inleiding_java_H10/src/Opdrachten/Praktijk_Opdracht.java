package Opdrachten;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijk_Opdracht extends Applet {
    TextField tekstvak;
    Button knop;
    Label label;
    String antwoord, tekst;
    int cijfer;

    public void init() {
        label = new Label("vul een cijfer van 1 tot 10 in in:");
        tekstvak = new TextField("", 10);
        knop = new Button();
        knop.setLabel("OK");
        knop.addActionListener(new KnopListener());

        add(label);
        add(tekstvak);
        add(knop);
        tekst ="vul een cijfer van 1 tot 10 in in";
    }

    public void paint(Graphics g) {
        g.drawString("het cijfer is: "+tekst, 50, 90);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            antwoord = tekstvak.getText();
            cijfer = Integer.parseInt(antwoord);
            switch(cijfer) {
                case 1:
                    tekst = "slecht.";
                    break;
                case 2:
                    tekst = "slecht.";
                    break;
                case 3:
                    tekst = "slecht.";
                    break;
                case 4:
                    tekst = "onvoldoende.";
                    break;
                case 5:
                    tekst = "matig.";
                    break;
                case 6:
                    tekst = "voldoende.";
                    break;
                case 7:
                    tekst = "voldoende.";
                    break;
                case 8:
                    tekst = "goed.";
                    break;
                case 9:
                    tekst = "goed.";
                    break;
                case 10:
                    tekst = "goed.";
                    break;
                default:
                    tekst = "een cijfer tussen de 1 en 10!";
                    break;
            }

            repaint();
        }
    }
}