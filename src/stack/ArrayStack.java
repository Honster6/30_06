package stack;

import java.util.EmptyStackException;

public class ArrayStack < T > implements Stack{

    private T [] stack;
    private T top;
    private int size;

    public ArrayStack(int size) {
        stack = (T[]) new Object[size];
        this.size = 0;
    }

    public void push(T element) {
        if (size != stack.length) {
            stack[size++] = element;
            top = element; //ostatni element
        } else {
            System.out.println("Stos został wypełniony. Nie można dodać nowego elementu!");
        }
    }

    public T peek() { // zwraca daną wartość, ale nie zdejmuje jej ze stosu
        if (!isEmpty()) {
            return top;
        } else {
            throw new EmptyStackException();
        }
    }

    public T pop() { // rozni sie od peek tym, ze "zdejmuje" dana wartosc ze stosu
        if (isEmpty()) {
            size--;
            if (size ==0) {
                top = null;

                return stack[size];
            }
            top = stack[size - 1];
            return stack[size];
        } else {
            throw new EmptyStackException();
        }

    }

    public boolean isEmpty() {

        return size == 0; //sprawdzenie czy stos jest pusty
    }

}