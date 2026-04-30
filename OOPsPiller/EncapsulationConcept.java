package OOPsPiller;

class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
// this keyword give the current object access, so that it's data can be
// accessed and same name of local variable and instance variable dosen't
// collapse

public class EncapsulationConcept {
    public static void main(String a[]) {
        Human obj = new Human();
        obj.setAge(8);
        obj.setName("Chandra"); // this is called function overloading, when I have same name of method but I am
                                // asign or setting the value of different type.
        int age = obj.getAge();
        String name = obj.getName();
        System.out.println(name + " : " + age);
    }
}
