public class ZeroOneKnapsackProblem {
    public static void main(String[] args) {
        int[] Weight = {2, 3, 4, 5};
        int[] Values = {3, 4, 5, 6};
        int Capacity = 8;
        int n = Weight.length;
        
        int[][] dp = new int[n + 1][Capacity + 1];
        
        for (int i = 1; i <= n; i++) {
            System.out.println("\n========================================");
            System.out.printf("Considering Item %d (Weight: %d, Value: %d)%n", i, Weight[i - 1], Values[i - 1]);
            System.out.println("========================================");
            
            for (int j = 1; j <= Capacity; j++) { // Notice j starts at 1, capacity 0 is always 0
                System.out.printf("-- Current Capacity (j): %d --%n", j);
                
                // 1. Option A: Do NOT include the current item
                int valueWithoutItem = dp[i - 1][j];
                System.out.printf("  Skip Item: Value from row above = %d%n", valueWithoutItem);
                
                dp[i][j] = valueWithoutItem; // Default assumption
                
                // 2. Option B: INCLUDE the current item (if it fits)
                if (Weight[i - 1] <= j) {
                    int remainingCapacity = j - Weight[i - 1];
                    int valueWithItem = Values[i - 1] + dp[i - 1][remainingCapacity];
                    
                    System.out.printf("  Take Item: Item Value (%d) + Max Value for remaining capacity %d (which is %d) = %d%n", 
                                      Values[i - 1], remainingCapacity, dp[i - 1][remainingCapacity], valueWithItem);
                    
                    // Choose the maximum of both options
                    if (valueWithItem > valueWithoutItem) {
                        System.out.printf("  -> Decision: TAKING item is better (%d > %d)%n", valueWithItem, valueWithoutItem);
                        dp[i][j] = valueWithItem;
                    } else {
                        System.out.printf("  -> Decision: SKIPPING item is better or equal (%d >= %d)%n", valueWithoutItem, valueWithItem);
                    }
                } else {
                    System.out.printf("  -> Decision: Item is too heavy (%d > %d), MUST SKIP.%n", Weight[i-1], j);
                }
            }
        }
        
        System.out.println("\nFinal Max value: " + dp[n][Capacity]);
        printDPTable(dp, Capacity, n);
    }

    // Helper method to visualize the final DP grid
    public static void printDPTable(int[][] dp, int capacity, int n) {
        System.out.println("\nFinal DP Table:");
        System.out.print("Cap:  ");
        for (int j = 0; j <= capacity; j++) System.out.printf("%3d ", j);
        System.out.println("\n-------------------------------------------");
        
        for (int i = 0; i <= n; i++) {
            System.out.printf("i=%d | ", i);
            for (int j = 0; j <= capacity; j++) {
                System.out.printf("%3d ", dp[i][j]);
            }
            System.out.println();
        }
    }
}