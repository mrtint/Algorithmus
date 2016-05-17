package gift.lifeis.algo;

public class Main {
    public static void main(String[] args) {
        ArrayMasterJedi yoda = new ArrayMasterJedi(100);
        ArrayJediSortable bubble = new BubbleJedi();

        yoda.setArrayJediSortable(bubble);
        yoda.test();
    }
}
