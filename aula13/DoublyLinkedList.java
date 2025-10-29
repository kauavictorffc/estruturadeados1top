public class DoublyLinkedList {
    Node head;
    Node tail;

    public void insertOrdered(int value) {
        Node newNode = new Node(value);

        if (head == null) { 
            head = tail = newNode;
            return;
        }

        Node current = head;
        while (current != null && current.value < value) {
            current = current.next;
        }

        if (current == head) { 
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (current == null) { 
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else { 
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
        }
    }

    public void printAscending() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) System.out.print(", ");
            current = current.next;
        }
        System.out.println();
    }

    public void printDescending() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.value);
            if (current.prev != null) System.out.print(", ");
            current = current.prev;
        }
        System.out.println();
    }

    public void removePrimes() {
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            if (isPrime(current.value)) {
                if (current.prev != null)
                    current.prev.next = current.next;
                else
                    head = current.next;

                if (current.next != null)
                    current.next.prev = current.prev;
                else
                    tail = current.prev;
            }
            current = nextNode;
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        n = Math.abs(n); 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
