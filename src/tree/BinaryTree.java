package tree;

class BinaryTree {

    private Node root;

    BinaryTree(Node node) {
        this.root = node;
    }

    void showTree(DfsType dfsType) {
        System.out.print(dfsType.name() + ": ");
        dfsType.showTree(root);
        System.out.println();
    }


    private void visit(Node node) {
        System.out.println(node.getValue());
    }
}