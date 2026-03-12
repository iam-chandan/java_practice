package lld;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    class Node{
        int key,value;
        Node next,prev;

        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

    private int capacity;
    private Map<Integer, Node> map;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new Node(0,0);
        this.tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }

    private void add(Node node){
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    public void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        remove(node);
        add(node);
        return node.value;
    }

    public void put(int key,int value){
        if(map.containsKey(key)){
            remove(map.get(key));
        }

        Node node = new Node(key,value);
        map.put(key,node);
        add(node);

        if (map.size() >= capacity){
            Node last = tail.prev;
            remove(last);
            map.remove(last.key);
        }
    }
}
