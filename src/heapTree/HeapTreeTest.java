package heapTree;

import static heapTree.HeapSort.heapSort;

public class HeapTreeTest {
    public static void main(String[] args) {
        HeapTree tree = new HeapTree (5);
        // 123, 2, 21, 91, 23
        tree.add(123);
        tree.add(2);
        tree.add(21);
        tree.add(91);
        tree.add(23);

        System.out.println(tree);
        System.out.println("Usuwanie: ");
        System.out.println(tree.remove());
        System.out.println(tree.remove());
        System.out.println(tree.remove());
        System.out.println(tree.remove());
        System.out.println(tree.remove());


    }
}
