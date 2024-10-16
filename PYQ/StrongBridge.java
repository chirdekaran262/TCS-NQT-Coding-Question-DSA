package PYQ;

import java.util.Arrays;
import java.util.Scanner;

public class StrongBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1, N2;

        // Get number of positions for both bridges
        System.out.print("Enter the number of strong positions for the first and second bridge: ");
        N1 = sc.nextInt();
        N2 = sc.nextInt();
        
        int a[] = new int[N1];
        int b[] = new int[N2];

        // Input positions for array a
        System.out.println("Enter elements for positions in array a (each on a new line): ");
        for (int i = 0; i < N1; i++) {
            a[i] = sc.nextInt();
        }
        
        // Input positions for array b
        System.out.println("Enter elements for positions in array b (each on a new line): ");
        for (int i = 0; i < N2; i++) {
            b[i] = sc.nextInt();
        }

        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Merge arrays while eliminating duplicates
        int r[] = new int[N1 + N2];
        int i = 0, j = 0, k = 0;

        while (i < N1 && j < N2) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
            } else if (j > 0 && b[j] == b[j - 1]) {
                j++;
            } else if (a[i] < b[j]) {
                r[k++] = a[i++];
            } else if (a[i] > b[j]) {
                r[k++] = b[j++];
            } else { // a[i] == b[j]
                r[k++] = a[i++];
                j++;
            }
        }

        // Add remaining elements from array a
        while (i < N1) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
            } else {
                r[k++] = a[i++];
            }
        }

        // Add remaining elements from array b
        while (j < N2) {
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
            } else {
                r[k++] = b[j++];
            }
        }

        // Calculate the median
        float avg;
        int mid = k / 2;
        if (k % 2 == 0) {
            avg = (float)(r[mid - 1] + r[mid]) / 2; // Use the middle two elements
        } else {
            avg = r[mid]; // Use the middle element
        }

        // Print the result formatted to two decimal places
        System.out.printf("Result is: %.2f\n", avg);
    }
}
