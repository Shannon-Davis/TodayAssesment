package question5;

public abstract class Person {

    private String name;
    private Integer age = 0;

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public boolean setAge(int age) {
        if (age < 0)
            return false;

        this.age = age;
        return true;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    abstract void greet();
}