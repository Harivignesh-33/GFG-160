class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        // int[] nArr =new int[a.length+b.length];
        // System.arraycopy(a, 0, nArr, 0, a.length);
        // System.arraycopy(b, 0, nArr, a.length, b.length);
        // Arrays.sort(nArr);
         
        // return nArr[k-1];
        int i = 0, j = 0, count = 0;
        int kth = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                kth = a[i++];
            } else {
                kth = b[j++];
            }
            count++;
            if (count == k) return kth;
        }
        while (i < a.length) {
            kth = a[i++];
            count++;
            if (count == k) return kth;
        }
        while (j < b.length) {
            kth = b[j++];
            count++;
            if (count == k) return kth;
        }
        return kth;
    }
}