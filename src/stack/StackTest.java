package stack;

import java.lang.reflect.Array;

public class StackTest {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack<>(10); // w <np. Integer - tylko liczby> podajemy jaki typ ma przyjac, jesli nie podamy nic to przyjmie wszystko
        System.out.println("Is empty: " + stack.isEmpty()); // sprawdzamy czy stos jest pusty
        stack.push(9); // dolozenie elementu do stosu
        System.out.println("Is empty: " + stack.isEmpty()); //po dolozeniu elementu stos nie jest pusty
        System.out.println("Stack top: " + stack.peek()); // wyswietlenie ostatniego dolozonego elementu
        stack.push(4); // dodanie kolejnego elementu, ktory jest na samej gorze stosu
        System.out.println("Stack top: " + stack.peek()); //wysweitlenie nowego ostatniego elementu
        stack.push(2);
        stack.push(5);
        stack.push(7);
        stack.push(234);
        stack.push(45);
        System.out.println("top: " + stack.peek());
        stack.push("lalala"); // gdyby przy deklaracji tablicy byloby <Integer> bylby blad, bo moze przyjac tylko liczby
        System.out.println("top: " + stack.peek());


        Box<String, Integer> box = new Box ("Jakiś tekst", 40); // po dodaniu <> po new Box nie przyjmie innego typu
        Box<Integer, String> box2 = new Box (172, "tekst "); // mozemy przechowywac rozne typy danych w jednej klasie


        LinkedStack linked = new LinkedStack();
        linked.push(10);
        System.out.println("LinkedStack top: " + linked.peek());
        linked.push(24);
        System.out.println("LinkedStack top: " + linked.peek());


    }
}
