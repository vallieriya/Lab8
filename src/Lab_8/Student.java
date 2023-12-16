package Lab_8;

public class Student extends People{
    String group;
    void learn(){
        System.out.println(name+" learn");
    }
    public Student(String name, String lastname, int age) {
        super(name, lastname, age);
    }
    public Student(String name, String lastname, String group, int age) {
        super(name, lastname, age);
        this.group = group;
    }
}
