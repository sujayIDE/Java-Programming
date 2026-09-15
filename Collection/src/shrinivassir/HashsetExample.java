package shrinivassir;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetExample {
    public static void main(String[] args) {
        Set<Integer> hashSet=new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);
        System.out.println(hashSet);
        System.out.println();
        Set<Integer> linkedHashset=new LinkedHashSet<>();
        linkedHashset.add(50);
        linkedHashset.add(30);
        linkedHashset.add(20);
        System.out.println(linkedHashset);
        System.out.println();
        Set<Integer> treeset=new TreeSet<>();
        treeset.add(60);
        treeset.add(70);
        treeset.add(10);
        System.out.println(treeset);



    }
}
