package Collections;

public class Human {
    String name;
    int age;
    height h;
    float weight;

    public Human(String name, int age, Collections.height h, float weight) {
        this.name = name;
        this.age = age;
        this.h = h;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", h=" + h +
                ", weight=" + weight +
                '}';
    }
}
