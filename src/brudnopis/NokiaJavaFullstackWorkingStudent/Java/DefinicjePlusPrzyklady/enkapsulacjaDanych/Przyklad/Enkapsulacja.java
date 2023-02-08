package rekru.rozmowy.NokiaJavaFullstackWorkingStudent.Java.DefinicjePlusPrzyklady.enkapsulacjaDanych.Przyklad;

public class Enkapsulacja {

    private int numer;
    private String nazwa;

    //metoda do ustawienia wartości
    public void setNumer(int numer) {
        this.numer = numer;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    //metody do pobrania wartości
    public int getNumer() {
        return numer;
    }

    public String getNazwa() {
        return nazwa;
    }
}

