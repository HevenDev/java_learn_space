// public class Array {
//     public static void main(String a[]){
//         int num[] = new int[4];

//         for(int i = 0; i< num.length; i++){
//             num[i] = i+5;
//             System.out.println(num[i]);
//         }
//     }
// }

// public class Array {
//     public static void main(String a[]){
//         int num[][] = new int[3][4];

//         // for(int i=0; i<3; i++){

//         //     for(int j=0; j<4; j++){
//         //         System.out.println("Here is value of jth " + j + " Which is child of ith " + i);
//         //     }
//         // }

//         for(int n[]: num){ // this is called enhanced For loop
//             for(int m: n){
//                 System.out.print(m + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Jagged array, when size is not specified of inside array.

// Enhanced for loop needs to practice, how does it worked, at timestapms of 04:09:33

public class Array {
    // need to print the patten as below
    // *
    // **
    // ***
    // ****
    public static void main(String a[]) {
        int num[] = new int[4];

        for (int i = 0; i < num.length; i++) {
            // for(int j=0; j< num[i].length; j++){

            // }
            int m = num.length;
            while (m > i) {
                System.out.print("*");
                m--;
            }
            
            System.out.println();
        }

        // for(int n[]: num){
        // for(int m: n){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
    }
}