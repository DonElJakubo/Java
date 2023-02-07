package rekru.rozmowy.NokiaJavaFullstackWorkingStudent.zadaniaDoRozmowy;

public class sumyCzesciowe {
    public static void main(String [] args){
        int[] array = {1,2,3,4,5,6};
        int sum = 0;
        for(int number : array){
            sum += number;
            System.out.println("Suma częściowa: " + sum);
        }
    }
}
