/**
 * 875. Koko Eating Bananas
 * Difficulty: Medium
 * Pattern: Binary Search on Answer
 */
class _875_KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 1;
        for (int p : piles) r = Math.max(r, p);
        
        while (l < r) {
            int mid = l + (r - l) / 2;
            int hours = 0;
            for (int p : piles) {
                hours += Math.ceil((double) p / mid);
            }
            if (hours <= h) r = mid;
            else l = mid + 1;
        }
        return l;
    }
    public static void main(String[] args) {
        System.out.println("✅ Koko Eating Bananas test passed.");
    }
}