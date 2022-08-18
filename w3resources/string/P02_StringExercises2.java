package w3resources.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P02_StringExercises2 {
    //Java Program to find duplicate characters in String.
    public static void main(String[] args) {
        printDuplicateCharacters("Programming");
        printDuplicateCharacters("Combination");
        printDuplicateCharacters("Java");
        printDuplicateCharacters("Master Chef");

    }

    public static void printDuplicateCharacters(String word){
        char[] characters = word.toCharArray();

        //build an HashMap with char and number (of times duplicates appear)
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        for(Character ch: characters){
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch)+1);
            } else {
                charMap.put(ch,1);
            }
        }

        //iterate through HashMap to print the duplicate chars of String
        Set<Map.Entry<Character,Integer>> entrySet = charMap.entrySet();
        System.out.printf("List of Duplicates chars found in the given string '%s' - %n",word);

        for(Map.Entry<Character, Integer> entry: entrySet){
            if(entry.getValue() > 1){
                System.out.printf("%s ==> %d %n ", entry.getKey(), entry.getValue());
            }

        }
    }

}
