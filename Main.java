import java.util.Scanner;


public class Main {
    public static void printArr(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[n - 1]);
    }
    public static int[] genArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * n) + 1;
            System.out.print(arr[i] + ", ");
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the number ordering system");
        try {
            System.out.println("What is the size of your array?");
            int n = sc.nextInt();
            int[] arr = genArr(n);
            sc.nextLine();
            while (true) {
                System.out.println("\nHow would you like to organize it? \n1. Smallest to largest \n2. Largest to smallest \n3. First even numbers, then odd numbers from smallest to largest \n4. Exit");
                String option = sc.nextLine();
                switch (option) {
                    case "1":
                        SortingMethods.ordAsc(arr);
                        printArr(arr,n);
                        break;
                    case "2":
                        SortingMethods.ordDesc(arr);
                        printArr(arr,n);
                        break;
                    case "3":
                        SortingMethods.even(arr);
                        break;
                    case "4":
                        System.out.println("Exiting the program. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid option, please try again.");
                        continue;
                }
            }
        } catch (Exception e) {
            System.out.println("Try again please");
        } finally {
            sc.close();
        }
    }
}