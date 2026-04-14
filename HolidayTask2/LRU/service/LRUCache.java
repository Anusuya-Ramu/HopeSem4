package HolidayTask2.LRU.service;
import HolidayTask2.LRU.model.*;
import java.util.HashMap;

public class LRUCache {
    private int capacity;
    private HashMap<Integer, Node> map;
    private Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;
    }

    private void insertNode(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    private void deleteNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;

        Node node = map.get(key);
        deleteNode(node);
        insertNode(node);

        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            deleteNode(map.get(key));
        }

        Node node = new Node(key, value);
        insertNode(node);
        map.put(key, node);

        if (map.size() > capacity) {
            Node lru = tail.prev;
            deleteNode(lru);
            map.remove(lru.key);
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
}