// Oparah Samuel
// 23CD010332
//Computer Science
import java.util.Arrays;
import java.util.Scanner;


public class Assignment {
    public static void main(String[] args) {
        // No 1
        pattern3(6);

    }

    // No 1
    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(" * * * * = = = = * * * * ");
        }

    }

    //No 1b
    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 4; j++) {
                System.out.print("= ");
            }

            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }

    // No 2

    static void pattern3(int n) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2; j++) {
                System.out.print("= ");
            }
            for (int j = 1; j <= 4; j++) {
                System.out.print("= ");
            }

            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("= ");
            }
            System.out.println();
        }
    }

    //   No 3
    public static class StatisticsCalculator {

        public static void main(String[] args) {
            double[] numbers = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};
            System.out.println("Mean: " + calculateMean(numbers));
            System.out.println("Median: " + calculateMedian(numbers));
            System.out.println("Standard Deviation: " + calculateStandardDeviation(numbers));
        }

        public static double calculateMean(double[] numbers) {
            double sum = 0;
            for (double num : numbers) {
                sum += num;
            }
            return sum / numbers.length;
        }

        public static double calculateMedian(double[] numbers) {
            Arrays.sort(numbers);
            if (numbers.length % 2 == 0) {
                return (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2;
            } else {
                return numbers[numbers.length / 2];
            }
        }

        public static double calculateStandardDeviation(double[] numbers) {
            double mean = calculateMean(numbers);
            double sumOfSquares = 0;
            for (double num : numbers) {
                sumOfSquares += Math.pow(num - mean, 2);
            }
            return Math.sqrt(sumOfSquares / numbers.length);
        }
    }

    // No 3 Begins


    public static int arrayPrint(int[] numbers) {
        int[] num = new int[10];

        Scanner in = new Scanner(System.in);

        System.out.println("You can only input " + num.length + " numbers");

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter your values for NO." + (i + 1) + ": ");

            num[i] = in.nextInt();
            // System.out.print("\n");

            System.out.println(num[i]);
        }
        System.out.println("The elements you entered are:");

        for (int i = 0; i <= 9; i = i + 1) {

            System.out.print(num[i] + ", ");
        }


        return 0;
    }

    // No 4 Begins Here

    static void arrayInput2(int[] num) {

        int[][] array_1 = new int[10][10];

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 10; j++) {

                Scanner in = new Scanner(System.in);

                System.out.println("Enter your value for row = " + (i + 1) + " col = " + (j + 1));

                array_1[i][j] = in.nextInt();

            }
        }
        System.out.println("The elements you entered are:");

        for (int i = 0; i <= 1; i = i + 1) {

            for (int j = 0; j <= 9; j++) {

                System.out.print(array_1[i][j] + ", ");
            }

            System.out.println();
        }

    }



}











