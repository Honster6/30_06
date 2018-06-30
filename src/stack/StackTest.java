package stack;

public class StackTest {
    public static void main(String[] args) {
        /*Stack stack = new Stack (10);
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
        stack.push(78);
        System.out.println("top: " + stack.peek());
        */

        Box<String, Integer> box = new Box ("Jakiś tekst", 40); // po dodaniu <> po new Box nie przyjmie innego typu
        Box<Integer, String> box2 = new Box (172, "tekst "); // mozemy przechowywac rozne typy danych w jednej klasie
        System.out.println(box.getElement());
        System.out.println(box2.getElement());
        System.out.println(box2.getElement());
        System.out.println(box2.getElement());
        System.out.println(box2.getElement());

    }
}
