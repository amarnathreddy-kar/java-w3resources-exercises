package w3resources.collection;

import java.util.*;

public class P05_TreeMapExercises {
    public static <Integers> void main(String[] args) {
        TreeMap<Integer, String> aTreeMap = new TreeMap<Integer, String>();

        //adding some elements to the tree map
        aTreeMap.put(1, "Violet");
        aTreeMap.put(2, "Indigo");
        aTreeMap.put(3, "Blue");
        aTreeMap.put(4, "Green");
        aTreeMap.put(5, "Yellow");
        aTreeMap.put(6, "Orange");
        aTreeMap.put(7, "Red");
        System.out.println();

        //iterating through the map
        System.out.println("**** Iterating through a TreeMap with entrySet(): ");
        for (Map.Entry<Integer, String> entry : aTreeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        System.out.println();

        //to copy a Tree Map content to another Tree Map content.
        //create new tree-map
        TreeMap<Integer, String> copiedTreeMap = new TreeMap<Integer, String>();
        System.out.println();

        //copying
        copiedTreeMap.putAll(aTreeMap);
        System.out.println("****Copied aTreeMap into copiedTreeMap: " + copiedTreeMap);
        System.out.println();

        //Java program to search a key in a Tree Map.
        if (aTreeMap.containsKey(7)) {
            System.out.println("****Found Key: 7 and it's associated value is = " + aTreeMap.get(7));
        } else {
            System.out.println("Key not found");
        }
        System.out.println();

        if (aTreeMap.containsKey(8)) {
            System.out.println("Key Found");
        } else {
            System.out.println("****Key: 8 cannot be found. " + aTreeMap.getOrDefault(8, "No associated match found for the key."));
        }
        System.out.println();

        //Java program to search a value in a Tree Map.
        for (Map.Entry<Integer, String> entry : aTreeMap.entrySet()) {
            if (entry.getValue() == "Red" && aTreeMap.containsValue("Red")) {
                System.out.println("****Found the Value and it's associated key is: " + entry.getKey());
            }
        }
        System.out.println();

        //Searcing for a key by value ('Ignorecase')
        for (Map.Entry<Integer, String> entry : aTreeMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase("blue")) {
                System.out.println("****Found the Value and it's associated key is: " + entry.getKey());
            }
        }

        System.out.println();
        //to get all the keys
        Set<Integer> allKeys = aTreeMap.keySet();
        System.out.println("**** All available keys in aTreeMap are: "+allKeys);
        System.out.println("Total count of keys is (aTreeMap size): "+aTreeMap.size());
        System.out.println("Total count of keys is (resultant set size): "+allKeys.size());
        System.out.println();

        //to get all associated values
        System.out.println("*** All available values of aTreeMap are: "+aTreeMap.values());
        System.out.println();

        //to delete a tree map
        System.out.print("**** Deleting copiedTreeMap: ");
        copiedTreeMap.clear();
        System.out.println(copiedTreeMap);

        System.out.println();
        //to sort keys in Tree Map by using comparator
        //creating a a tree-map
        TreeMap<String, String> phonics = new TreeMap<String, String>();
        phonics.put("C1", "Apple");
        phonics.put("C3", "Cap");
        phonics.put("C5", "Elephant");
        phonics.put("C2", "Ball");
        phonics.put("C6","Fish");
        phonics.put("C4","Dog");
        System.out.println("****The list gets automatically sorted by key: "+phonics);

        System.out.println();
        //get a key-value mapping associated with the greatest key and the least key in a map.
        System.out.println("****Greatest key-value for phonics TreeMap: " + phonics.firstEntry());
        System.out.println("Least key-value for phonics TreeMap: " + phonics.lastEntry());

        System.out.println();
        //get the first (lowest) key and the last (highest) key currently in a map.
        System.out.println("****Greatest key for phonics TreeMap: " + phonics.firstKey());
        System.out.println("Least key for phonics TreeMap: " + phonics.lastKey());

        System.out.println();
        //get a reverse order view of the keys contained in a given map.
        System.out.println("****Reverse order view of keys for phonics TreeMap is: "+phonics.descendingKeySet());
        System.out.println("****Reverse order view of keys for aTreeMap is: "+aTreeMap.descendingKeySet());

        System.out.println();
        //get a key-value mapping associated with the greatest key less than or equal to the given key.
        System.out.println("****Checking key-value for one of the keys of aTreeMap: "+aTreeMap.floorEntry(3));
        System.out.println("****Checking key-value for one of the keys of phonics TreeMap: "+phonics.floorEntry("C2"));

        System.out.println();
        //get the greatest key less than or equal to the given key.
        System.out.println("****Checking key entry for nearest value of 10 in aTreemap: "+aTreeMap.floorEntry(15));
        System.out.println("****Checking key entry for nearest value of C7 in phonics TreeMap: "+phonics.floorEntry("C9"));

        System.out.println();
        //get the portion of a map whose keys are strictly less than a given key.
        System.out.println("Actual TreeMap is: "+aTreeMap);
        System.out.println("****Checking for entry 3 (Inclusive): "+aTreeMap.headMap(3));
        System.out.println("Actual phonics TreeMap is: "+phonics);
        System.out.println("****Checking for entry C3 (Inclusive) "+phonics.headMap("C3"));

        System.out.println();
        //get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
        System.out.println("Actual TreeMap is: "+aTreeMap);
        System.out.println("****Checking for entry 3 (Inclusive): "+aTreeMap.headMap(3,true));
        System.out.println("Actual phonics TreeMap is: "+phonics);
        System.out.println("****Checking for entry C3 (Inclusive)"+phonics.headMap("C3",true));

        System.out.println();
        //get the least key strictly greater than the given key. Return null if there is no such key.
        System.out.println("Orginal TreeMap content: "+aTreeMap);
        System.out.println("Checking the entry for 1: ");
        System.out.println("Key(s): "+aTreeMap.higherEntry(1));
        System.out.println("Checking the entry for 2: ");
        System.out.println("Key(s): "+aTreeMap.higherEntry(2));
        System.out.println("Checking the entry for 7: ");
        System.out.println("Key(s): "+aTreeMap.higherEntry(7));

        System.out.println();
        System.out.println("Orginal phonics TreeMap content: "+phonics);
        System.out.println("Checking the entry for C2: ");
        System.out.println("Key(s): "+phonics.higherEntry("C2"));
        System.out.println("Checking the entry for C3: ");
        System.out.println("Key(s): "+phonics.higherEntry("C3"));
        System.out.println("Checking the entry for C7: ");
        System.out.println("Key(s): "+phonics.higherEntry("C7"));

        //get NavigableSet view of the keys contained in a map.
        System.out.println("NavigableKey Set>>>>>"+phonics.navigableKeySet());

        //remove and get a key-value mapping associated with the least key in a map.
        //poll first entry
        System.out.println();
        System.out.println("Value before poll: "+aTreeMap);
        System.out.println("****Value returned (after pollFirstEntry): "+aTreeMap.pollFirstEntry());
        System.out.println("Value after poll: "+aTreeMap);

        //remove and get a key-value mapping associated with the greatest key in this map.
        //poll last entry
        System.out.println();
        System.out.println("Value before poll: "+aTreeMap);
        System.out.println("****Value returned (after pollLastEntry): "+aTreeMap.pollLastEntry());
        System.out.println("Value after poll: "+aTreeMap);

        //get the portion of a map whose keys range from a given key to another key.
        System.out.println();
        SortedMap<String, String> partOfPhonics = new TreeMap<String, String>();
        partOfPhonics = phonics.subMap("C3", true, "C5", true);
        System.out.println("****Sub Map Key-values: "+partOfPhonics);

    }

}
