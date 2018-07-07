package tree;

public class BinaryTree {

    private Node root;


    public BinaryTree(Node node) {
        this.root = node;

    }

    public void showTree()
    {
        preOrder(root);
    }
    private void preOrder(Node node) {
        if (node != null) {
            visit(node);
            preOrder((node.getLeftChild()));
            preOrder(node.getRightChild());
        }
    }

    private void visit(Node node) {
        System.out.println(node.getValue());
    }


}
