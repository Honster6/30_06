package list;

class List {
    private ListElement first;
    private ListElement last;
    private int size;


    public List() {
        this.first = null;
        this.last = null;
        this.size = 0;

    }

    public void add(int element) {
        ListElement current = new ListElement(element);
        if (isEmpty()) {
            last = first = current;
        } else {
            last.nextElement = current;
            current.previousElement = last;
            last = current;
        }
        size++;
    }

    public void add(int index, int element) {

    }

    public int get(int n) {
        int current = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (temp == 0) {
                current = first.value;
                first = first.nextElement;
            } temp++;
        } return current;
    }

    public int remove() {
        return 0;
    }

    public int getSize() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    private class ListElement {
        private int value;
        private ListElement nextElement;
        private ListElement previousElement;

        public ListElement(int value) {
            this.value = value;
            this.nextElement = null;
            this.previousElement = null;
        }
    }


}


