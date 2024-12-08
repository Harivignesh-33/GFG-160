class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        List<int[]> mergedIntervals = new ArrayList<>();
        
        if (arr == null || arr.length == 0) return mergedIntervals;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int[] currentInterval = arr[0];
        mergedIntervals.add(currentInterval);

        for (int[] interval : arr) {
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (nextStart <= currentEnd) { 
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                mergedIntervals.add(currentInterval);
            }
        }

        return mergedIntervals;
    }
}