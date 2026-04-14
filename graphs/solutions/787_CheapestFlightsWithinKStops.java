import java.util.*;
class _787_CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] prices = new int[n];
        Arrays.fill(prices, Integer.MAX_VALUE);
        prices[src] = 0;
        
        for (int i=0; i<=k; i++) {
            int[] temp = Arrays.copyOf(prices, n);
            for (int[] f : flights) {
                int u = f[0], v = f[1], p = f[2];
                if (prices[u] == Integer.MAX_VALUE) continue;
                if (prices[u] + p < temp[v]) {
                    temp[v] = prices[u] + p;
                }
            }
            prices = temp;
        }
        return prices[dst] == Integer.MAX_VALUE ? -1 : prices[dst];
    }
    public static void main(String[] args) {}
}
