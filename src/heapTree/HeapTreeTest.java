package heapTree;

public class HeapTreeTest {
    public static void main(String[] args) {
        HeapTree tree = new HeapTree (10);
        tree.add(20);
        tree.add(13);
        tree.add(15);
        tree.add(7);
        tree.add(2);
        System.out.println(tree);
        tree.add(17);
        System.out.println(tree);
    }
}
