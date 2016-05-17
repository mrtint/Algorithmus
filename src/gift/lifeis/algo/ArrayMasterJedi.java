package gift.lifeis.algo;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ArrayMasterJedi {
    private ArrayJediSortable arrayJediSortable;
    private int[] testArray = null;
    private int[] tempArray = null;

    public ArrayMasterJedi(int testIntensive) {
        testArray = createArray(testIntensive);
        System.out.print("MASTER TEST : ");
        display(testArray);
    }

    public void test() {
        if (arrayJediSortable != null) {
            long start = System.nanoTime();
            long end = 0L;
            tempArray = testArray;
            arrayJediSortable.sort(tempArray);
            end = System.nanoTime();
            System.out.print(arrayJediSortable.getName() + "(" + getElapsed(start, end) + " ms) : ");
            display(tempArray);
        } else {
            System.out.println("There is no jedi.");
        }
    }

    private float getElapsed(long end, long start) {
        long elapsed = start - end;
        return TimeUnit.MILLISECONDS.convert(elapsed, TimeUnit.NANOSECONDS);
    }

    public int[] createArray(int size) {
        int[] arr = new int[size];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size);
        }
        return arr;
    }

    private void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public ArrayJediSortable getArrayJediSortable() {
        return arrayJediSortable;
    }

    public void setArrayJediSortable(ArrayJediSortable arrayJediSortable) {
        this.arrayJediSortable = arrayJediSortable;
    }
}
