package sort;

public class BubbleSort {


    public static void bubbleSort(int[] data) {
        int current = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < (data.length - i); j++) {
                if (data[j - 1] > data[j]) {

                    current = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = current;

                }
            }
        }
    }

}
