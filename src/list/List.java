package list;

public class List {
    private ListElement first;
    private ListElement last;
    private int size;


    public List() {
        this.first = null;
        this.last = null;
        this.size = 0;

    }

    public void add(int element) { // można miec dwie metody o tej samej nazwie, program sprawdza po ilosci argumentów
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

    public void add(int index, int value) {
        if (isEmpty() || index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        ListElement newElement = new ListElement(value);
        if (index == 0) {

            first.previousElement = newElement;
            newElement.nextElement = first;
            first = newElement;
        } else {
            ListElement elementUnderIndex = findElement(index);
            ListElement previousElemUnderIndex = elementUnderIndex.previousElement;
            previousElemUnderIndex.nextElement = newElement;
            newElement.previousElement = previousElemUnderIndex;
            newElement.nextElement = elementUnderIndex;
            elementUnderIndex.previousElement = newElement;
        }
        size++;

    }

    private ListElement findElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        ListElement currentElement = first;
        for (int i = 0; i < index; i++) {
            currentElement = currentElement.nextElement;
        }
        return currentElement;
    }
    public int get(int index) {
        return findElement(index).value;
    }

    /*public int get(int index) {
        int current = 0;
        int temp = 0;
        for (int i = 0; i < index; i++) {
            if (temp == 0) {
                current = first.value;
                first = first.nextElement;
            } temp++;
        } return current;
    }*/


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


