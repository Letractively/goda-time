/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.goda.chronic;

import junit.framework.TestCase;
import org.goda.time.MutableInterval;

/**
 *
 * @author kebernet
 */
public class ChronicTest extends TestCase {
    
    public ChronicTest(String testName) {
        super(testName);
    }

    /**
     * Test of parse method, of class Chronic.
     */
    public void testParse_String() {
        System.out.println("parse");
        Options o = new Options();
       // o.setDebug(true);
        MutableInterval expResult = null;
        MutableInterval result = Chronic.parse("this tuesday 5:00", o);
        System.out.println(result);
        result = Chronic.parse("1979-05-27", o);
        System.out.println(result);

        result = Chronic.parse("Aug 23, 2010", o);
        System.out.println(result);

        result = Chronic.parse("1st monday in sept", o);
        System.out.println(result);

        result = Chronic.parse("september 4th", o);
        System.out.println(result);

        result = Chronic.parse("1st of september", o);
        System.out.println(result);

        result = Chronic.parse("three hundred twenty-one and a half days ago", o);
        System.out.println(result);
    }

    /**
     * Test of parse method, of class Chronic.
     */
    public void xtestParse_String_Options() {
        System.out.println("parse");
        String text = "";
        Options options = null;
        MutableInterval expResult = null;
        MutableInterval result = Chronic.parse(text, options);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
