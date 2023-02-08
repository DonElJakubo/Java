package rekru.rozmowy.NokiaJavaFullstackWorkingStudent.Java.DefinicjePlusPrzyklady.KlasyIInterfejsy.Przyklad;

public class polaczoneExampleClass implements ExampleInterface {
    private String name;
    private int age;

    public polaczoneExampleClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
