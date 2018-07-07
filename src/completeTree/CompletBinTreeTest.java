package completeTree;

public class CompletBinTreeTest {
    public static void main(String[] args) {
        CompleteBinaryTree <Integer> tree = new CompleteBinaryTree<>(10);
        tree.add(10);
        tree.add(66);
        tree.add(45);
        tree.add(32);
        tree.add(88);
        tree.add(6546);
        tree.add(34);

        System.out.println(tree);
        System.out.println(tree.getLeftChild(2));
        System.out.println(tree.getRightChild(2));
    }
}
