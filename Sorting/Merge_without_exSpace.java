
class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int i = 0, j = 0;
        int k = a.length - 1, m = b.length;

        while (i <= k && j < m) {
            if (a[i] <= b[j]) {
                i++;
            } else{
                int temp = b[j];
                b[j] = a[k];
                a[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
