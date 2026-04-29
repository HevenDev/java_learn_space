class Calculator{
    public int add(int n1, int n2){
        int r = n1 + n2;
        return r;
    }
}

class Demo {
    public static void main(String a[]) {
        int num1 = 1;
        int num2 = 3;

        Calculator calc = new Calculator(); // this is how an object instance initialize with the new keyword. Here Calculator class ,as a design, initializes the object JVM do that behind the scene. calc is the reference variable here. with the type of Calculator
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}