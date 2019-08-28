package elementary;

public class SingleLinkedList<T> {
    private Node<T> head;

    public void add(T element) {
        Node<T> newNode = new Node<T>(element);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> node = head;
            while(node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    public Iterator<T> iterator() {
        return new Iterator<T>(head);
    }

    private static class Node<T> {
        T value;
        Node<T> next;

        public Node(T element) {
            this.value = element;
        }
    }

    public static class Iterator<T> {
        private Node<T> next;

        private Iterator(Node<T> next) {
            this.next = next;
        }

        public boolean hasNext() {
            return next != null;
        }

        public T next() {
            if (next == null) {
                throw new IllegalStateException("Next value unavailable.");
            }

            T value = next.value;
            next = next.next;

            return value;
        }
    }
}
