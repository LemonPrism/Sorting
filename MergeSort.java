public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        mergeSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] arr) {

        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;

        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < arr.length; i++) {
            if (i < mid) {
                left[i] = arr[i];
            } else {
                right[i - mid] = arr[i];
            }
        }

        mergeSort(left);
        mergeSort(right);

        merge(left, right, arr);
    }

    public static void merge(int[] left, int[] right, int[] arr) {

        int i = 0; 
        int l = 0;
        int r = 0; 

        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                arr[i] = left[l];
                l++;
            } else {
                arr[i] = right[r];
                r++;
            }
            i++;
        }

        
        while (l < left.length) {
                arr[i] = left[l];
                l++;
                i++;
        }

        
        while (r < right.length) {
                arr[i] = right[r];
                    r++;
                i++;
        }
    }
}
