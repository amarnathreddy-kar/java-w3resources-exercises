package w3resources.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P04_HashMapBasics {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("-------------------------Start of Hash Map Exercise----------------------------------");
        System.out.println();

        //creating a new HashMap
        HashMap<Integer, String> firstMap = new HashMap<Integer, String>();
        firstMap.put(1, "Amarnath Reddy. K");
        firstMap.put(2, "Mamatha");
        firstMap.put(3, "Keethannath Reddy. K");
        firstMap.put(4, "Nuthan Sai Reddy");
        firstMap.put(5, "Anuradha");
        firstMap.put(6, "Pulla Reddy. K");

        //to print the map to the console
        System.out.println(firstMap);

        System.out.println("****Iterating to the HashMap ****");
        for(Map.Entry x: firstMap.entrySet()){
            System.out.println(x.getKey()+": "+x.getValue());
        }

        //to count the number of key-value (size) mappings in a map
        System.out.println("****Size of the HashMap is: "+firstMap.size());

        //creating an empty hashmap
        Map<Integer, String > secondMap = new HashMap<>();
        //to copy all of the mappings from the specified map to another map.
        secondMap.putAll(firstMap);
        System.out.println("**** After copying firstMap to secondMap: "+secondMap);
        System.out.println("****secondMap Contains Key (4): "+secondMap.containsKey(4));

        //to remove all the mappings from a map.
        secondMap.clear();
        System.out.println("**** After removing secondMap: "+secondMap);

        Map<Integer, String > thirdMap = new HashMap<>();
        thirdMap.clear(); //deleting an empty map will not raise any exception
        System.out.println("****Is Map Empty? "+thirdMap.isEmpty()); //true //to check if it contains data
        System.out.println("****Contains Key "+thirdMap.containsKey(1));

        //to get a shallow copy of a HashMap instance
        Map<Integer, String> copiedMap = new HashMap<>();
        copiedMap = (HashMap<Integer, String>)firstMap.clone();
        System.out.println("Cloned Map i.e, copiedMap is: "+copiedMap);

        System.out.println("-----------------------------------------------------------");
        //test if a map contains a mapping for the specified key
        System.out.println("Original Map: "+firstMap);

        System.out.println("Is Key 1 exists? ");
        if(firstMap.containsKey(1)){
            System.out.println("****Yes Key: 1 exists and it's associated value is: "+firstMap.get(1));
        }else {
            System.out.println("Key does not exist");
        }

        System.out.println("Is Key 8 exists? ");
        if(firstMap.containsKey(8)){
            System.out.println("Yes Key: 6 exists and it's associated value is: "+firstMap.get(8));
        } else {
            System.out.println("****Key: 8 does not exist. "+firstMap.getOrDefault(8, "Not Found"));
        }
        System.out.println("-----------------------------------------------------------");

        //to test if a map contains a mapping for the specified value
        if(firstMap.containsValue("Keethannath Reddy. K")){ //the value should be an exact match
            System.out.println("****The value exists");
        }else {
            System.out.println("The value does not exist");
        }
        System.out.println("-----------------------------------------------------------");

        //to create a set view of the mappings contained in a map.
        Set valuesSet = firstMap.entrySet();
        System.out.println("****All Values associated to the keys are: "+valuesSet);

        //to get a set view of the keys contained in this map.
        Set keys = firstMap.keySet();
        System.out.println("****All the Keys are: "+keys);

        //to get the value of a specified key in a map.
        String value = firstMap.get(1);
        System.out.println("****firstMap.get(1) extracts: "+firstMap.get(1));

        //to get a collection view of the values contained in this map
        System.out.println("Collection view (of all values associated to the keys of firstMap are: "+firstMap.values());

        System.out.println();
        System.out.println("-------------------------End of Hash Map Exercise----------------------------------");
        System.out.println();
    }
}
