package com.crazyang.java8;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName MapDemo
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/5/4 下午3:33.
 */

public class MapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

        AtomicInteger i = new AtomicInteger(0);


    }
}


class MyHASHMap<K, V> extends AbstractMap<K, V>
        implements Map<K, V>, Cloneable, Serializable {

    float loadfactory = 0.75f;

    int threshold;

    int defaul_capacity = 16;

    Node<K, V>[] table;

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }


    static class Node<K, V> implements Map.Entry<K, V> {

        final K k;
        V value;
        final int hash;
        Node<K, V> next;

        public Node(K k, V value, int hash, Node<K, V> next) {
            this.k = k;
            this.value = value;
            this.hash = hash;
            this.next = next;
        }


        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }
    }

    public MyHASHMap(float loadfactory, int threshold, int defaul_capacity) {
        this.loadfactory = loadfactory;
        this.threshold = threshold;
        this.defaul_capacity = defaul_capacity;
    }

    public V put(K key, V value) {
        if (table.length < 0) {
            //重新定义table
        }
        if (key == null) {
            //key为空，将value放入数组的第一个元素
        }
        int hash = key.hashCode();
        int i = hash;
        for (Node<K, V> e = table[i]; e != null; e = e.next) {

        }
        return value;
    }

}
