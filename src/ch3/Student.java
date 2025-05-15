package ch3;
//Constructors can specify parameters but cannot specify return types.
public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Student(String name) {
        this.name= name;
    }

    public static void main(String[] args) {

        Student student= new Student("Shamim");
        
        System.out.println(student.getName());



    }
}
