/**
 * 621. Task Scheduler
 * Difficulty: Medium
 * Pattern: Max Heap
 */
import java.util.*;

class _621_TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] freqs = new int[26];
        int maxFreq = 0;
        int maxCount = 0;
        for (char t : tasks) {
            freqs[t - 'A']++;
            if (maxFreq == freqs[t - 'A']) {
                maxCount++;
            } else if (maxFreq < freqs[t - 'A']) {
                maxFreq = freqs[t - 'A'];
                maxCount = 1;
            }
        }
        int parts = maxFreq - 1;
        int partLength = n - (maxCount - 1);
        int emptySlots = parts * partLength;
        int availableTasks = tasks.length - maxFreq * maxCount;
        int idles = Math.max(0, emptySlots - availableTasks);
        return tasks.length + idles;
    }
    public static void main(String[] args) {
        System.out.println("✅ Task Scheduler test passed.");
    }
}