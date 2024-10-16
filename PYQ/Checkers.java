package PYQ;

import java.util.Scanner;

public class Checkers {

        // Function to get the maximum volume
        public static int getMaxVol(int money, int[] price, int[] volume, int n) {
            int[][] K = new int[n + 1][money + 1]; // Create a 2D array for DP
            
            // Fill the DP table
            for (int i = 0; i <= n; i++) {
                for (int m = 0; m <= money; m++) {
                    if (i == 0 || m == 0) {
                        K[i][m] = 0; // Base case: if no item or no money
                    } else if (price[i - 1] <= m) {
                        // Take the maximum of either including or not including the current item
                        K[i][m] = Math.max(volume[i - 1] + K[i - 1][m - price[i - 1]], K[i - 1][m]);
                    } else {
                        // If the item price is greater than the money available, exclude the item
                        K[i][m] = K[i - 1][m];
                    }
                }
            }
            return K[n][money]; // Return the maximum volume for the given money
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            // Input N (number of items) and money
            int N = sc.nextInt();
            int money = sc.nextInt();
    
            // Input price array
            int[] price = new int[N];
            for (int i = 0; i < N; i++) {
                price[i] = sc.nextInt();
            }
    
            // Input volume array
            int[] volume = new int[N];
            for (int i = 0; i < N; i++) {
                volume[i] = sc.nextInt();
            }
    
            // Print the maximum volume
            System.out.println(getMaxVol(money, price, volume, N));
        }
    }
    