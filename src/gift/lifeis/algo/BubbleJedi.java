package gift.lifeis.algo;

public class BubbleJedi implements ArrayJediSortable {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    swap(arr, j, i);
                }
            }
        }
    }

    @Override
    public String getName() {
        return "BUBBLE";
    }

    private void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
