package sort;


import java.util.ArrayList;


public class BubbleSortTest {

    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();
        int data[] = new int[]
                {
                        22,
                        77,
                        40,
                        2,
                        12398,
                        228,
                        98
                };

        System.out.println("Przed sortowaniem: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println("////// - - - - - - /////");
        System.out.println("Po sortowaniu: ");
        bubble.bubbleSort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }


    }


}
