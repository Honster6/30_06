package stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack (10);
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

    }
}
