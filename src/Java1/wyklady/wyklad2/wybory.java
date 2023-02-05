package Java1.wyklady.wyklad2;

public class wybory {
    public static void main(String[] args) {


        int wiek = (int) (Math.random() * 50);

        if (wiek < 18) {
            System.out.println("Masz: "+ wiek);
            System.out.println("Nie jesteś pełnoletni");
            System.out.println("Nie możesz głosować w wyborach");
        } else if (wiek < 21) {
            System.out.println("Masz: "+ wiek);
            System.out.println("Jesteś pełnoletni, ale masz mniej niż 21 lat");
            System.out.println("Możesz głosować, ale nie możesz jeszcze kandydować");
        } else if (wiek < 30) {
            System.out.println("Masz: "+ wiek);
            System.out.println("Jesteś pełnoletni, ale masz mniej niż 30 lat");
            System.out.println("Możesz głosować, możesz zostać posłem, nie możesz zostać senatorem");
        } else if (wiek < 35) {
            System.out.println("Masz: "+ wiek);
            System.out.println("Jesteś pełnoletni, ale masz mniej niż 35 lat");
            System.out.println("Możesz głosować, możesz zostać posłem, senatorem lub prezydentem miasta");
        } else {
            System.out.println("Masz: "+ wiek);
            System.out.println("Jesteś pełnoletni, i masz co najmniej 35 lat");
            System.out.println("Możesz głosować, możesz zostać posłem, senatorem, prezydentem państwa");
        }
    }
}