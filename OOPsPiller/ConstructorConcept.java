package OOPsPiller;

class Human {
    private int age;
    private String name;

    // public Human() { // default constructor
    //     age = 13;
    //     name = "Doe";
    // }

    public Human(int age, String name){ // parameterized constructor
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class ConstructorConcept {
    public static void main(String a[]) {
        Human obj = new Human(12, "John");
        System.out.print(obj.getAge() + " " + obj.getName());
    }
}


