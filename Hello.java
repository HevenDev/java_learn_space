class Operator {
    public static void main(String args[]) {
        int num1 = 3;
        int num2 = 5;
        int num3 = 6;
        if (num1 > num2 && num1 > num3) {
            System.out.println("Num1 is greater");
            System.out.println(num1);
        } else if(num2 > num3) { // we already checked above x, we should avoid re checking that x with y again because if the code reaches here that means y is already greater than x.
            System.out.println("Num2 is greater");
            System.out.println(num2);
        } else {
            System.out.println("Num3 is greater");
            System.out.println(num3);
        }
    }
}