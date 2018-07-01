

    package queue;

import java.util.EmptyStackException;

    class Queue <T> {

        private QueueElement<T> first;
        private QueueElement<T> last;
        private Integer size;

        public Queue() {
            this.first = null;
            this.last = null;
            this.size = 0;
        }

        public void push(T element) {
            if (isEmpty()) {
                last = new QueueElement<>(element);
                first = last;
                size++;
            } else {
                last.nextElement = new QueueElement<>(element);
                last = last.nextElement;
                size++; // size ++ mozna wrzucic po if'ie
            }
        }

        public T front() {
            if (isEmpty()) {
                throw new EmptyStackException();
            } else {
                return first.value;
            }
        }

        public T pop() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            if (size == 1) {
                last = null;
            }
                T temp = first.value;
                first = first.nextElement;
                size--;
                return temp;
            }




        public boolean isEmpty() {
            return size == 0;
        }

        private class QueueElement<T> {
            private T value;
            private QueueElement <T> nextElement;

            public QueueElement(T value) {
                this.value = value;
                this.nextElement = null;
            }
        }
    }



