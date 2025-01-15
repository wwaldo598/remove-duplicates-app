package com.rdp;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesApplication
{

    /**
     * @param input Simple value to process.
     * @return A String value without duplicated characters.
     */
    public static String removeDuplicatedChars (String input) {
        if (input == null || input.isEmpty())
            return input;
        StringBuilder str = new StringBuilder();
        Set<Character> setInput = new HashSet<>();
        for (char item : input.toCharArray()){
              if (setInput.add(item)){
                  str.append(item);
              }
        }
        return str.toString();
    }

    public static void main( String[] args )
    {
        String value = "AABBCCD112233";
        System.out.println("main : Start");
        System.out.println("main : Processing duplicated characters..." );
        System.out.println("main : Input to process [" + value + "]");
        System.out.println("main : Result...........[" + removeDuplicatedChars (value) + "]");
        System.out.println("main : End");
        System.out.println("main : Oki doki.");
    }
}
