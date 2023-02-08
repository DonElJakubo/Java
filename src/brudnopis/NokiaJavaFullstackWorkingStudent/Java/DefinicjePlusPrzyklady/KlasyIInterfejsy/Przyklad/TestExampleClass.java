package rekru.rozmowy.NokiaJavaFullstackWorkingStudent.Java.DefinicjePlusPrzyklady.KlasyIInterfejsy.Przyklad;

public class TestExampleClass {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass("John", 25);
        System.out.println("Name: " + exampleClass.getName());
        System.out.println("Age: " + exampleClass.getAge());
        exampleClass.setName("Jack");
        exampleClass.setAge(30);
        System.out.println("Name: " + exampleClass.getName());
        System.out.println("Age: " + exampleClass.getAge());
    }
}
