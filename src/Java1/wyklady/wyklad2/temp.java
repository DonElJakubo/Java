package Java1.wyklady.wyklad2;

import java.util.Random;

public class temp {
    public static void main(String[] args) {

        Random random = new Random();
        int temperatura = random.nextInt(201) - 100;
        if (temperatura < 100) {
            String stanSkupienia;
            System.out.println("Temp: " + temperatura);
            stanSkupienia = temperatura < 0 ? "lód" : "woda";
            System.out.println("Stan skupienia H2O dla tej temp. to: " + stanSkupienia);
        } else {
            System.out.println("Temp: "+ temperatura);
            System.out.println("Stan szkupienia H2O dal tej temp. to: Para wodna");
            System.out.println("Ponieważ woda paruje w temp. 100 stopni (gotuje się)");
        }
    }
}
