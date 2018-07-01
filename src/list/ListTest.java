package list;

public class ListTest {
    public static void main(String[] args) {
        List list = new List();
        list.add(5);  // 1
        list.add(16); // 2
        list.add(45); // 3
        list.add(17); // 4
        list.add(25); // 5
        list.add(13); // 6
        list.add(456); // 7
        System.out.println("Przed dodaniem nowego elementu na wybraną pozycję: " + list.getSize());
//        System.out.println("Poycja w liście: "  + list.get(1));  skrot ctrl + / wykomentowanie linijki
        //System.out.println("Poycja w liście: "  + list.get(2));
        //System.out.println("Pozycja w liście " + list.get(3));
        //System.out.println("Pojedyńcza pozycja: " + list.get(4));
        /*for (int i = 0; i < list.getSize(); i++) {
            System.out.println("Pozycja nr: " + i + " - " + list.get(i));
        }
        System.out.println(list.get(2)); // indexy zaczynaja sie od zera*/

        list.add(5, 999);
        System.out.println("Po dodaniu nowego elementu na wybraną pozycję: " + list.getSize());
        for (int i = 0; i < list.getSize(); i++) {
           System.out.println("Pozycja nr: " + i + " - " + list.get(i));
        }

        System.out.println("///TESTOWANIE KASOWANIA ///");
        System.out.println();
        System.out.println("Element usuniety: "+ list.remove(2));
        System.out.println("Rozmiar tablicy po skasowaniu elementu: " + list.getSize());
        System.out.println();
        System.out.println("Lista po skasowaniu elementu: ");

        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("Pozycja nr: " + i + " - " + list.get(i));
        }



















    }
}
