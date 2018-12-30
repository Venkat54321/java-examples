package examples;

import java.util.HashMap;

class Entry{

    int value;
    int key;
    Entry left;
    Entry right;

}

public class DLLLRUCache {

    HashMap<Integer,Entry> hashMap;
    Entry start,end;
    int LRU_CACHE_SIZE = 4;

    public DLLLRUCache(){
        hashMap = new HashMap<Integer, Entry>();
    }

    public int getEntry(int key){
        if(hashMap.containsKey(key)){
            Entry entry = hashMap.get(key);
            removeNode(entry);
            addAtTop(entry);
            return entry.value;
        }
        return -1;
    }

    public void putEntry(int key,int value){

        if(hashMap.containsKey(key)){

            Entry entry = hashMap.get(key);
            entry.value = value;
            removeNode(entry);
            addAtTop(entry);

        }else{
            Entry newNode = new Entry();
            newNode.left = null;
            newNode.right = null;
            newNode.value = value;
            newNode.key = key;

            if(hashMap.size() > LRU_CACHE_SIZE){

                hashMap.remove(end.key);
                removeNode(end);
                addAtTop(newNode);

            }else{
                addAtTop(newNode);
            }

            hashMap.put(key,newNode);

        }


    }

    public void removeNode(Entry node){

        if (node.left != null) {
            node.left.right = node.right;
        } else {
            start = node.right;
        }

        if (node.right != null) {
            node.right.left = node.left;
        } else {
            end = node.left;
        }

    }

    public void addAtTop(Entry node){

        node.right = start;
        node.left = null;
        if(start != null){
            start.left = node;
        }
        start = node;
        if(end == null)
            end = start;

    }

    public static void main(String[] args) {

        DLLLRUCache dlllruCache = new DLLLRUCache();

        dlllruCache.putEntry(1,111);
        dlllruCache.putEntry(2,222);
        dlllruCache.putEntry(3,333);
        dlllruCache.putEntry(4,444);
        dlllruCache.putEntry(5,555);
        dlllruCache.putEntry(6,666);
        dlllruCache.putEntry(7,777);

        System.out.println(dlllruCache.getEntry(1));
        System.out.println(dlllruCache.getEntry(7));
        System.out.println(dlllruCache.getEntry(2));


    }

}
