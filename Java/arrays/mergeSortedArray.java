public class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        mergeSortedArray solution = new mergeSortedArray();

        int[] nums1 = {1, 3, 4, 5, 0, 0, 0, 0};
        int m = 4;
        int[] nums2 = {2, 4, 6, 8};
        int n = 4;

        solution.merge(nums1, m, nums2, n);

        System.out.println("Merged array:");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}

