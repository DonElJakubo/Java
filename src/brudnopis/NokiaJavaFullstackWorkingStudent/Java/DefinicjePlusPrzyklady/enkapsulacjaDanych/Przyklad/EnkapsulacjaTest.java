package rekru.rozmowy.NokiaJavaFullstackWorkingStudent.Java.DefinicjePlusPrzyklady.enkapsulacjaDanych.Przyklad;

//klasa główna
public class EnkapsulacjaTest {

    public static void main(String[] args) {
        Enkapsulacja obiekt = new Enkapsulacja();
        obiekt.setNumer(1);
        obiekt.setNazwa("Test");

        System.out.println(obiekt.getNumer());
        System.out.println(obiekt.getNazwa());
    }
}
