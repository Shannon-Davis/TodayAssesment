package question5;

public class Main {

    public static void main(String[] args) {

        Students person1 = new Students("Shannon", 22, "Junior");
        person1.setAge(-10);

        System.out.println(person1.getAge());
        System.out.println(person1);

    }
}
