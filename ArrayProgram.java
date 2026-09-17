import java.util.Scanner;

public class ArrayProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++)
            arr[i] = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }

        System.out.println("Second Largest: " + second);

        System.out.println("Frequency:");
        for (int i = 0; i < arr.length; i++) {
            boolean visited = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j])
                    visited = true;
            }
            if (!visited) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j])
                        count++;
                }
                System.out.println(arr[i] + " = " + count);
            }
        }

        System.out.println("Duplicates:");
        for (int i = 0; i < arr.length; i++) {
            boolean printed = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k])
                    printed = true;
            }
            if (!printed) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println(arr[i]);
                        break;
                    }
                }
            }
        }
    }
}