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
        System.out.println(list.getSize());
        //System.out.println("Poycja w liście: "  + list.get(1));
        //System.out.println("Poycja w liście: "  + list.get(2));
        //System.out.println("Pozycja w liście " + list.get(3));
        //System.out.println("Pojedyńcza pozycja: " + list.get(4));
        for (int i = 1; i <= list.getSize(); i++) {
            System.out.println("Pozycja nr: " + i + " - " + list.get(i));
        }











    }
}
