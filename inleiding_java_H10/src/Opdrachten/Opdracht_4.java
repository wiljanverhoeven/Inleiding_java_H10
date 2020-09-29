package Opdrachten;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht_4 extends Applet {
    TextField tekstvak, tekstvak2;
    Label label, label2;
    String antwoord, tekst, jaartal, jaar;
    int maand, jaar2;
    Button knop;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("type een nummmer van een maand in:");
        tekstvak2 = new TextField("", 20);
        label2 = new Label("type een jaartal in:");
        knop = new Button();
        knop.setLabel( "OK" );
        knop.addActionListener(new TekstvakListener());

        add(label);
        add(tekstvak);
        add(label2);
        add(tekstvak2);
        add(knop);

        tekst = ("vul een maand nummer in");
        jaartal = ("vul een jaartal in");
    }

    public void paint(Graphics g) {
        g.drawString("" + tekst, 50, 90);
        g.drawString("" + jaartal, 50, 110);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            antwoord = tekstvak.getText();
            maand = Integer.parseInt(antwoord);
            
            jaar = tekstvak2.getText();
            jaar2 = Integer.parseInt(jaar);

            if ( (jaar2 % 4 == 0 && !(jaar2% 100 == 0)) || jaar2 % 400 == 0 ){
                jaartal = "" +jaar +"is een schikkeljaar";
            }
            else {
                jaartal = "" +jaar +"is geen schikkeljaar";
            }

            switch (maand) {
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

