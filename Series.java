public class Series {

    public static void main(String[] args) {

      // for loop :even series
        int sumEven = 0;

        System.out.println("Even Series (For Loop):");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
            sumEven += i;
        }
        System.out.println("\nSum = " + sumEven);

        //for loop :odd series
        int sumOdd = 0;

        System.out.println("\nOdd Series (For Loop):");
        for (int i = 1; i <= 19; i += 2) {
            System.out.print(i + " ");
            sumOdd += i;
        }
        System.out.println("\nSum = " + sumOdd);

       // while loop :even series
        int i = 2;
        sumEven = 0;

        System.out.println("\nEven Series (While Loop):");
        while (i <= 20) {
            System.out.print(i + " ");
            sumEven += i;
            i += 2;
        }
        System.out.println("\nSum = " + sumEven);
         //while loop :odd series
        i = 1;
        sumOdd = 0;

        System.out.println("\nOdd Series (While Loop):");
        while (i <= 19) {
            System.out.print(i + " ");
            sumOdd += i;
            i += 2;
        }
        System.out.println("\nSum = " + sumOdd);

        //do while loop:even series
        i = 2;
        sumEven = 0;

        System.out.println("\nEven Series (Do-While Loop):");
        do {
            System.out.print(i + " ");
            sumEven += i;
            i += 2;
        } while (i <= 20);

        System.out.println("\nSum = " + sumEven);

       // do while loop :odd series
        i = 1;
        sumOdd = 0;

        System.out.println("\nOdd Series (Do-While Loop):");
        do {
            System.out.print(i + " ");
            sumOdd += i;
            i += 2;
        } while (i <= 19);

        System.out.println("\nSum = " + sumOdd);
    }
}