package com.rdp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple RemoveDuplicatesApplication.
 */
public class RemoveDuplicatesApplicationTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RemoveDuplicatesApplicationTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( RemoveDuplicatesApplicationTest.class );
    }

    public void testRemoveDuplicatedChars_EmptyInputValue(){
        String value = "";
        String expectedValue = "";
        String result = RemoveDuplicatesApplication.removeDuplicatedChars(value);
        assertEquals(expectedValue, result);
    }

    public void testRemoveDuplicatedChars_NullInputValue(){
        String value = null;
        String expectedValue = null;
        String result = RemoveDuplicatesApplication.removeDuplicatedChars(value);
        assertEquals(expectedValue, result);
    }

    public void testRemoveDuplicatedChars_SingleCharacterInputValue(){
        String value = "W";
        String expectedValue = "W";
        String result = RemoveDuplicatesApplication.removeDuplicatedChars(value);
        assertEquals(expectedValue, result);
    }

    public void testRemoveDuplicatedChars_DuplicatedCharactersInputValue(){
        String value = "WERQWERQ";
        String expectedValue = "WERQ";
        String result = RemoveDuplicatesApplication.removeDuplicatedChars(value);
        assertEquals(expectedValue, result);
    }

    public void testRemoveDuplicatedChars_OthersDuplicatedCharactersInputValue(){
        String value = "AABBCCD112233";
        String expectedValue = "ABCD123";
        String result = RemoveDuplicatesApplication.removeDuplicatedChars(value);
        assertEquals(expectedValue, result);
    }

}
