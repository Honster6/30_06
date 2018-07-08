package heapTree;

import java.util.Arrays;

class HeapTree {
    private int[] tree;
    private int lastIndex;

    public HeapTree(int size) {
        this.tree = new int[size];
        this.lastIndex = 0;
    }

    void add(int value) {
        int current = lastIndex++;
        int parent = current != 0 ? getParent(current) : 0;
        while (current > 0 && tree[parent] < value) {
            tree[current] = tree[parent];
            current = parent;
            parent = getParent(current);
        }
        tree[current] = value;
        }

    public int remove() {
        if (!hasNodes()) {
            throw new IndexOutOfBoundsException();
        }
        int elementToRemove = tree[0];
        int currentIndex = 0;
        int greaterChildIndex = getGreaterChildIndex(0);
        int lastValue = tree[--lastIndex];

        while (greaterChildIndex < lastIndex && tree[greaterChildIndex] > lastValue) {
            tree[currentIndex] = tree[greaterChildIndex];
            currentIndex = greaterChildIndex;
            greaterChildIndex = getGreaterChildIndex(currentIndex);
        }
        tree[currentIndex] = lastValue;

        return elementToRemove;
    }

        static int [] heapSort(int [] array) {
        HeapTree heap = new HeapTree(array.length);
        Arrays.stream(array).forEach(heap::add);
        int [] sortedArray = new int [array.length];
        for (int i = array.length - 1; heap.hasNodes(); i--) {
            array[i] = heap.remove();
        } return sortedArray;
        }



    private int getGreaterChildIndex(int index) {
            if (hasRightChild(index)) {
                return getLeftChild(index) > getRightChild(index) ?
                        getLeftChildIndex(index) : getRightChildIndex(index);
            } else if (hasLeftChild(index)) {
                return getLeftChildIndex(index);
            } else {
                return lastIndex + 1;
            }
    }
    private boolean hasRightChild(int index) {
        return (2 * index + 2) < lastIndex;
    }
    private boolean hasLeftChild(int index) {
        return (2 * index + 1) < lastIndex;
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
    public boolean hasNodes() {
        return lastIndex > 0;
    }

    boolean isLeaf(int index) {
        return !isLeftChild(index);
    }

    @Override
    public String toString() {
        return Arrays.toString(tree);
    }
}


