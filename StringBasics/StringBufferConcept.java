package StringBasics;

public class StringBufferConcept {
    public static void main(String a[]) {
        StringBuffer str = new StringBuffer("Chandra");
        str.append(" Prakash");
        System.out.println(str);
    }
}

// string buffer is thread safe and string builder is not
