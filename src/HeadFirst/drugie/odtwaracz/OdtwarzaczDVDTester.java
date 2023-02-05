package HeadFirst.drugie.odtwaracz;

public class OdtwarzaczDVDTester {
    public static void main(String[] args) {
        OdtwarzaczDVD o = new OdtwarzaczDVD();
        o.mozeNagrywac = true;
        o.odtworzPlyteDVD();

        if (o.mozeNagrywac == true)
        {
            o.nagrajPlyteDVD();
        }
    }
}
