package HeadFirst.drugie.zagadkowyBasen3;

public class Trojkat {
    double pole;
    int wysokosc;
    int dlugosc;

    public static void main(String[] args) {
        int x=0;
        Trojkat[] ta = new Trojkat[4];
        while (x<4)
        {
            ta[x] = new Trojkat();
            ta[x].wysokosc = (x+1) *2;
            ta[x].dlugosc = x+4;
            ta[x].okreslPole();
            System.out.print("trojkat " +(x+1)+ ", pole");
            System.out.println(" = "+ ta[x].pole);
            x = x+1;
        }
        int y = x;
        x = 27;
        Trojkat t5 = ta[2];
        ta[2].pole = 343;
        System.out.print("y = "+y);
        System.out.println(", pole t5 = "+ t5.pole);
    }
    void okreslPole(){
        pole = (wysokosc * dlugosc) /2;
    }
}
