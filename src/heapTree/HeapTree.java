package heapTree;

import java.util.Arrays;

class HeapTree{
    private int[] tree;
    private int lastIndex;

    public HeapTree(int size) {
        this.tree = new int [size];
        this.lastIndex = 0;
    }

    void add(int value) {
        int current = lastIndex++;
        int parent = current != 0 ? getParent(current) : 0;
        while (current > 0 && tree[parent] < value) {
            tree [current] = tree [parent];
            current = parent;
            parent = getParent(current);
        }
        tree [current] = value;


    }

    public void insert(int value) {

    }

    public void siftUp(int index) {

    }




    int getLeftChild(int index) {
        return tree[getLeftChildIndex(index)];
    }

    int getRightChild(int index) {
        return tree[getRightChildIndex(index)];
    }


    int getLeftChildIndex(int index) {
        if (isLeftChild(index)) {
            return 2 * index + 1;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean isLeftChild(int index) {
        return (2 * index + 1) < lastIndex;
    }

    int getRightChildIndex(int index) {
        if (isRightChild(index)) {
            return 2 * index + 2;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean isRightChild(int index) {
        return (2 * index + 2) < lastIndex;
    }

    int getParent(int index) {
        if (index != 0) {
            return (index - 1) / 2;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    boolean isLeaf(int index) {
        return !isLeftChild(index);
    }

    @Override
    public String toString() {
        return Arrays.toString(tree);
    }
}


