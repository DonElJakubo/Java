package Java1.Cwiczenia1;

import javax.swing.*;

public class Zadanie2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Data Output");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 150);
        frame.setVisible(true);
        JPanel panel1 = new JPanel();
        panel1.setSize(400, 200);
        frame.add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setSize(400, 200);
        frame.add(panel2);



        JLabel markiLabel = new JLabel("Marki:");
        panel1.add(markiLabel);

        String[] marka = new String[5];
        marka[0] = "1. Ferrari";
        marka[1] = "2. Porshe";
        marka[2] = "3. Audi";
        marka[3] = "4. Mercedes";
        marka[4] = "5. Volvo";
        JList markiList = new JList(marka);
        panel1.add(markiList);


        JLabel modeleLabel = new JLabel("Modele:");
        panel2.add(modeleLabel);

        String[] modeleFerrari = new String[2];
        String[] modelePorshe = new String[2];
        String[] modeleAudi = new String[2];
        String[] modeleMercedes = new String[2];
        String[] modeleVolvo = new String[2];

        modeleFerrari[0] = "488 Italia";
        modeleFerrari[1] = "La Ferrari";

        modelePorshe[0] = "911";
        modelePorshe[1] = "Macan";

        modeleAudi[0] = "RSQ8";
        modeleAudi[1] = "A7 RS Sportback";

        modeleMercedes[0] = "CLS 600 long";
        modeleMercedes[1] = "GLC 220 AMG";

        modeleVolvo[0] = "XC40";
        modeleVolvo[1] = "XC 90";

        String[] modele = new String[5];
        modele[0] = "Modele Ferrari: " + modeleFerrari[0] + " | " + modeleFerrari[1];
        modele[1] = "Modele Porshe: " + modelePorshe[0] + " | " + modelePorshe[1];
        modele[2] = "Modele Audi: " + modeleAudi[0] + " | " + modeleAudi[1];
        modele[3] = "Modele Mercedes: " + modeleMercedes[0] + " | " + modeleMercedes[1];
        modele[4] = "Modele Volvo: " + modeleVolvo[0] + " | " + modeleVolvo[1];
        JList modeleList = new JList(modele);
        panel2.add(modeleList);
    }
}