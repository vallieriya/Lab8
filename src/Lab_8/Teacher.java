package Lab_8;

public class Teacher extends People{
    void teach(){
        System.out.println(name+" teach");
    }
    public Teacher(String name, String lastname, int age) {
        super(name, lastname, age);
    }

}
