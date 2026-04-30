package OOPsPiller.Inherit;

public class InheritanceConcept {
    public static void main(String a[]) {
        Calc obj = new Calc();
        int result = obj.add(2, 5);

        System.out.println(result);

        AdvCalc obj2 = new AdvCalc();

        System.out.println(obj2.sub(2, 3));
    }
}
