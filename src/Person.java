public class Person {
    private String name;

    public Person(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student extends Person{
    public Student(String name){
        super(name);
    }
}
