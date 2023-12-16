package Lab_8;

public class People {
    protected String name,lastname;
    protected int age;
    void walk(){
        System.out.println(name+" walk");
    }
    void voice(){
        System.out.println(name+" talk");
    }
    void run(){
        System.out.println(name+" run");
    }
    public People(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
}
