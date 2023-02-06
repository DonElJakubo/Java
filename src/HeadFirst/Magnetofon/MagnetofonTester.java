package HeadFirst.Magnetofon;

class MagnetofonTester
{
    public static void main(String[] args) {
        Magnetofon m = new Magnetofon();
        m.mozeNagrywac = true;
        m.odtworzTasme();
        if (m.mozeNagrywac == true){
            m.nagrajTasme();
        }
    }
}
