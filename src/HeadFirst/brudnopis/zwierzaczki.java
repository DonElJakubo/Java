package HeadFirst.brudnopis;

import HeadFirst.Pies.Pies;

public class zwierzaczki {


    public static void main(String[] args) {
        Pies[] zwierzaki;
        zwierzaki = new Pies[7];
        zwierzaki[0] = new Pies();
        zwierzaki[1] = new Pies();
        zwierzaki[3] = zwierzaki[1];
        System.out.println(zwierzaki[1]+" "+zwierzaki[0]+" "+zwierzaki[3]);

    }

}
