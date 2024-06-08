class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        // add code here.
        int i = 0;
        int j = 0;
        while (j < arr2.length) {
            if (arr1[i] != arr2[j])
                return i;
            i++;
            j++;
        }
        return i;
    }
}