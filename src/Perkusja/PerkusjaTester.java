package Perkusja;

public class PerkusjaTester {
    public static void main(String[] args) {
        Perkusja p = new Perkusja();

        p.beben = false;
        p.zagrajNaBebnie();
        p.zagrajNaTalerzach();

        if (p.beben == true)
        {
            p.zagrajNaBebnie();
        }
    }
}
