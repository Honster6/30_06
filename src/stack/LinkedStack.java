package stack;

class LinkedStack {

    private StackElement top;
    private int size;

    public LinkedStack() {
        this.top = null;
        this.size = 0;
    }

    public void push (int value) {
        size++;
        top = new StackElement(value, top);
    }

    public int peek () {
        return top.value;
    }

    private class StackElement {
        Integer value;
        StackElement previousElement;

        public StackElement(Integer value, StackElement previousElement) {
            this.value = value;
            this.previousElement = previousElement;
        }
    }

}
