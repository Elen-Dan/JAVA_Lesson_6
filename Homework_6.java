import java.util.*;

public class Homework_6 {
    private static HashMap<Integer, Object> hmap = new HashMap<>();
    private static final Object OBJ = new Object();
    public static void main(String[] args) {
        

        addToHMap(25);
        addToHMap(1);
        addToHMap(3);
        addToHMap(25);
        addToHMap(15);
        addToHMap(4);
        addToHMap(8);
        System.out.println(hmap.keySet());
        System.out.println(isEmpty());
        entryPrint();
        System.out.println();
        System.out.println(getKey(2));
        try {
            System.out.println(getKey(10));
        } catch (Exception e) {
            System.out.println("Индекс отсутствует");
        }

        Iterator<Integer> iterator = hmap.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
   
    private static void addToHMap(Integer number) {
        hmap.put(number, OBJ);
    }

    private static boolean isEmpty() {
        return hmap.isEmpty();
    }

    private static void entryPrint() {
        Object[] tmp = hmap.keySet().toArray();
        for (Object el : tmp) {
            System.out.print((Integer) el + " ");
        }
    }

    private static int getKey(Integer index) {
        Object[] tmp = hmap.keySet().toArray();
        return (Integer) tmp[index];
    }
}
