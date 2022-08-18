package w3resources.string;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class P01_StringBasicOperations {

    public static <Char> void main(String[] args) {

        //get the character at the given index within the String.
        String string1 = "Java Exercices";
        System.out.println("String1 :" + string1);
        System.out.println("Character (Char) at index[0] is: " + string1.charAt(0));
        System.out.println("Character (Char) at index[10] is: " + string1.charAt(10));
        System.out.println("Length of string: " + string1.length());

        //find total number of characters in a given string
        System.out.println("Total number of characters in a string (including blanks): " + string1.length());
        String string2 = string1.replaceAll("\\s", ""); //remove all spaces from the string/ words and find length
        System.out.println("String2: " + string2);
        System.out.println("Total number of characters in a string (without blanks): " + string2.length());

        //to convert a String to Char [] array:
        String string3 = "Convert this to a Char [] array";
        //String string3 = "Java Exercices";
        char[] arr = string3.toCharArray();
        System.out.println("String3 (char [] arr): " + Arrays.toString(arr));
        System.out.println("The datatype of arr is: " + arr.getClass().getSimpleName());
        System.out.println("Total number of characters in a char [] arr (including blanks): " + arr.length);

        //to find the total char count with for loop
        int count = 0, total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!Character.isWhitespace(arr[i])) {
                // System.out.print(arr[i]+" "); //for debugging
                count++;
            }
        }
        System.out.println("Total number of characters in a char [] arr (without blanks): " + count);

        //get the character (Unicode code point) at the given index within the String.
        String string4 = "0aABCDbc";
        System.out.println("string4 = " + string4);
        System.out.println("Character(unicode point) of a: " + string4.codePointAt(1));
        System.out.println("Character(unicode point) of A: " + string4.codePointAt(2));

        //program to compare two strings lexicographically. (anologous to sorting in a dictionary
        // Two strings are lexicographically equal if they have the same length and contain characters at the same positions.
        String string5 = "This is Exercise1";
        String string6 = "This is Exercise2";
        String string7 = "This is Exercise2";
        String string8 = "This is exercise1";
        String string9 = "This is exercise2";

        System.out.println(string5.compareTo(string6)); //below return integers per below if-else case
        System.out.println(string6.compareTo(string7));
        System.out.println(string5.compareToIgnoreCase(string8));
        System.out.println(string8.compareToIgnoreCase(string9));

        int result = string5.compareTo(string6);

        if (result < 0) {
            System.out.println("'" + string5 + "' is less than '" + string6 + "'");
        } else if (result == 0) {
            System.out.println("Both Strings are equal");
        } else {
            System.out.println("'" + string5 + "' is greater than '" + string6 + "'");
        }

        //program to concatenate a given string to the end of another string
        String string10 = "Java Collections and ";
        String string11 = "Streams API";
        //String string12 = string10.concat(string11);
        string11 = string10.concat(string11);
        System.out.println("Concat string10 and string11, updated string11 = " + string11);

        //test if a given string contains the specified sequence of char values
        String string12 = "Api";
        System.out.println("string12 = " + string12);
        System.out.println("String11 contains 'API' ? " + string11.contains(string12));
        System.out.println("String11 contains 'API' (Ignoring case) ? " + string11.toLowerCase().contains(string12.toLowerCase()));

        //program to compare a given string to the specified string buffer
        String string13 = "example.com", string14 = "Example.com";
        StringBuffer strbuf = new StringBuffer(string13);

        System.out.println("Comparing " + string13 + " and " + strbuf + ": " + string13.contentEquals(strbuf));
        System.out.println("Comparing " + string14 + " and " + strbuf + ": " + string14.contentEquals(strbuf));

        /*
        The String#equals() not only compares the String's contents, but also checks if the other object is also an instance of a String.
        The String#contentEquals() only compares the contents (the character sequence) and does not check if the other object is also an instance of String.
        It can be anything as long as it is an implementation of CharSequence which covers a.o. String, StringBuilder, StringBuffer, CharBuffer, etc.
         */

        //program to check whether a given string ends with the contents of another string.
        String string15 = ".com";
        System.out.println("string13 ends with '.com' ? " + string13.endsWith(string15));

        //program to check whether two String objects contain the same data
        String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "Mike Royko";
        String columnist4 = "stephen edwin king";

        // Display the results of the equality checks.
        System.out.println("\"" + columnist1 + "\" equals \"" + columnist2 + "\"? " + columnist1.equals(columnist2));
        System.out.println("\"" + columnist1 + "\" equals \"" + columnist3 + "\"? " + columnist1.equals(columnist3));

        //compare a given string to another string, ignoring case considerations.
        System.out.println("\"" + columnist1 + "\" equals ignore case \"" + columnist2 + "\"? " + columnist1.equalsIgnoreCase(columnist2));
        System.out.println("\"" + columnist1 + "\" equals ignore case \"" + columnist4 + "\"? " + columnist1.equalsIgnoreCase(columnist4));

        //program to get the contents of a given string as a byte array.
        byte[] byte_arr = columnist4.getBytes();
        System.out.println("String columnist4 as byte [] byte_arr is: " + byte_arr);
        System.out.println("String columnist4 as byte [] byte_arr is: " + Arrays.toString(byte_arr));
        System.out.println("The data type for columinst4 is: " + byte_arr.getClass().getSimpleName());

        //create a unique identifier of a given string i.e, generating hashCode() (useful for password encryption)
        Integer hashing_value = string1.hashCode();
        System.out.println("The unique hash code generated for string1 = 'Java Exercices' is: " + hashing_value);

        /* In order to put the strings in the string pool, one needs to call the intern() method.
        Before creating an object in the string pool, the JVM checks whether the string is already present in the pool or not.
        If the string is present, its reference is returned. */

        //get the canonical representation of the string object.
        String string16 = "Java Exercises";
        String string17 = new StringBuffer("Java").append(" Exercises").toString();
        String string18 = string17.intern();

        System.out.println("string16 == string17? " + (string16 == string17));
        System.out.println("string16 == string18? " + (string16 == string18));

        //replace a specified character with another character.
        String string19 = "The quick brown fox jumps over the lazy dog.";

        // Replace all the 'd' characters with 'f' characters.
        String new_str = string19.replace('d', 'f');

        // Display the strings for comparison.
        System.out.println("Actual string19 = " + string19);
        System.out.println("Replaced new_str = " + new_str);

        //replace each substring of a given string that matches the given regular expression with the given replacement.
        String new_str_replaceAll = new_str.replaceAll("fog", "cat");
        System.out.println("Updating 'fog' to 'cat' in new_str: " + new_str_replaceAll);

        //get a substring of a given string between two specified positions.
        String new_subStr = new_str_replaceAll.substring(10, 26);
        System.out.println("New SubString: new_subStr = " + new_subStr);

        /*  find length of the longest substring of a given string without repeating characters.

            Note: 1) Given string consists of English letters, digits, symbols and spaces.
            2) 0 <= Given string length <= 5 * 104

            Input String : pickoutthelongestsubstring
            The longest substring : [u, b, s, t, r, i, n, g]
            The longest Substring Length : 8

            Input String : ppppppppppppp
            The longest substring : [p]
            The longest Substring Length : 1

            Input String : Microsoft
            The longest substring : [M, i, c, r, o, s]
            The longest Substring Length : 6 */

        //the solution/ method is outside of main block

        longestSubstring("pickoutthelongestsubstring");
        longestSubstring("ppppppppppppp");
        longestSubstring("google");
        longestSubstring("amarnathreddy");

        //print after removing duplicates from a given string





    }

    static void longestSubstring(String inputString) {
        char[] arr1 = inputString.toCharArray();
        String long_str = null;
        int str_length = 0;
        LinkedHashMap<Character, Integer>
                charPosMap = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < arr1.length; i++) {
            char ch = arr1[i];
            if (!charPosMap.containsKey(ch)) {
                charPosMap.put(ch, i);
            } else {
                i = charPosMap.get(ch);
                charPosMap.clear();
            }
            if (charPosMap.size() > str_length) {
                str_length = charPosMap.size();
                long_str = charPosMap.keySet().toString();
            }
        }
        System.out.println("Input String : " + inputString);
        System.out.println("The longest substring : " + long_str);
        System.out.println("The longest Substring Length : " + str_length);
    }
}
