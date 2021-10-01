package question5;

public class Students extends Person{

    public String gradeLevel;


    public Students(String name, Integer age, String gradeLevel) {
        super(name, age);
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String toString() {
        return "Students{" +
                "gradeLevel='" + gradeLevel + '\'' +
                '}';
    }

    @Override
    void greet() {
        System.out.println("Good Morning everybody");

    }
}
