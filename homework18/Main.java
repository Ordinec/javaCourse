package homework18;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet<>();
        TreeSet treeSet = new TreeSet();

        for (int i = 0; i < 1000; i++){
            Random random = new Random();
            int value = random.nextInt(1, 51);
            hashSet.add(value);
            linkedHashSet.add(value);
            treeSet.add(value);
        }

        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }
}
