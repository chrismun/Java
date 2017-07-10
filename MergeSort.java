public class MergeSort {
    private int[] nums, secondary;
    private int num;

    public void sort(int[] values) {
        this.nums = values;
        num = values.length;
        this.secondary = new int[num];
        mergesort(0, num - 1);
    }

    private void mergesort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergesort(low, middle); // sort each side
            mergesort(middle + 1, high);
            merge(low, middle, high); // combine them
        }
    }

    private void merge(int low, int middle, int high) {

        for (int i = low; i <= high; i++) {
            secondary[i] = nums[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        while (i <= middle && j <= high) {
            if (secondary[i] <= secondary[j]) {
                nums[k] = secondary[i];
                i++;
            } else {
                nums[k] = secondary[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            nums[k] = secondary[i];
            k++;
            i++;
        }
    }
}
