package elementary;

import org.junit.jupiter.api.Test;

public class SingleLinkedListTest {
    @Test
    public void insertionTest() {
        SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        SingleLinkedList.Iterator<Integer> ite = list.iterator();
        while(ite.hasNext()) {
            System.out.println(ite.next() + ", ");
        }
    }
}
