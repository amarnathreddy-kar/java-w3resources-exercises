package w3resources.collection;

public class Student {

    private int rollNbr;
    private String name;
    private int age;

    public Student(int rollNbr, String name, int age) {
        this.rollNbr = rollNbr;
        this.name = name;
        this.age = age;
    }

    public int getRollNbr() {
        return rollNbr;
    }

    public void setRollNbr(int rollNbr) {
        this.rollNbr = rollNbr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
