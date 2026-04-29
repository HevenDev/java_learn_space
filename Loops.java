public class Loops {
    public static void main(String args[]) {
        int i = 1;

        while (i <= 7) {

            int j = 0;
            switch (i) {
                case 1:
                    System.out.println("Monday");
                    while (j <= 24) {
                        System.out.println("Hour " + j);
                        j++;
                    }
                    break;
                case 2:
                    System.out.println("Tuesday");
                    while (j <= 24) {
                        System.out.println("Hour " + j);
                        j++;
                    }
                    break;
                case 3:
                    System.out.println("Wednesday");
                    while (j <= 24) {
                        System.out.println("Hour " + j);
                        j++;
                    }
                    break;
                case 4:
                    System.out.println("Thrusday");
                    while (j <= 24) {
                        System.out.println("Hour " + j);
                        j++;
                    }
                    break;
                case 5:
                    System.out.println("Friday");
                    while (j <= 24) {
                        System.out.println("Hour " + j);
                        j++;
                    }
                    break;
                case 6:
                    System.out.println("Saturday");
                    while (j <= 24) {
                        System.out.println("Hour " + j);
                        j++;
                    }
                    break;
                case 7:
                    System.out.println("Sunday");
                    while (j < 24) {
                        System.out.println("Hour " + j);
                        j++;
                    }
                    break;

                default:
                    System.out.println("Wrong day");
                    break;
            }
            i++;
        }

    }
}
// I have done the loops concept
