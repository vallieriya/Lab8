package Lab_8;
public class Main {
    public static void main(String[] args){
        People people = new People("people","peoplich", 99);
        Student student = new Student("Faleria","Fedotova",20);
        Teacher teacher = new Teacher("Nikolai","Petrov",30);
        people.run();
        people.walk();
        people.voice();
        student.run();
        student.walk();
        student.voice();
        student.learn();
        teacher.run();
        teacher.walk();
        teacher.voice();
        teacher.teach();
    }
}