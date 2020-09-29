package Opdrachten;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht_3 extends Applet {
    TextField tekstvak;
    Label label;
    String antwoord, tekst;
    int maand;

        public void init(){
            tekstvak = new TextField("", 20);
            label = new Label("type een nummmer van een maand in:");
            tekstvak.addActionListener( new TekstvakListener() );
            add(label);
            add(tekstvak);
            tekst =("vul een maand nummer in");
        }
        public void paint(Graphics g) {
            g.drawString(""+tekst,50,50);

    }
    class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            antwoord = tekstvak.getText();
            maand = Integer.parseInt(antwoord);
            switch(maand) {
                case 1:
                    tekst = "Januari heeft 31 dagen.";
                    break;
                case 2:
                    tekst = "Februari heeft 28/29 dagen.";
                    break;
                case 3:
                    tekst = "Maart heeft 31 dagen.";
                    break;
                case 4:
                    tekst = "April heeft 30 dagen.";
                    break;
                case 5:
                    tekst = "Mei heeft 31 dagen.";
                    break;
                case 6:
                    tekst = "Juni heeft 30 dagen.";
                    break;
                case 7:
                    tekst = "July heeft 31 dagen.";
                    break;
                case 8:
                    tekst = "Augustus heeft 31 dagen.";
                    break;
                case 9:
                    tekst = "September heeft 30 dagen.";
                    break;
                case 10:
                    tekst = "Oktober heeft 31 dagen.";
                    break;
                case 11:
                    tekst = "November heeft 30 dagen.";
                    break;
                case 12:
                    tekst = "December heeft 31 dagen,";
                    break;
                default:
                    tekst = "vul een maandnummer in.";
                    break;
            }
                    repaint();
            }
        }
    }



